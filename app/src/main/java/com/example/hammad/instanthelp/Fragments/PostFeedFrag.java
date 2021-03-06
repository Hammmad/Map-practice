package com.example.hammad.instanthelp.Fragments;


import android.app.AlertDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.hammad.instanthelp.Adapter.PostFeedAdapter;
import com.example.hammad.instanthelp.R;
import com.example.hammad.instanthelp.models.PostModule;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import dmax.dialog.SpotsDialog;

/**
 * A simple {@link Fragment} subclass.
 */
public class PostFeedFrag extends Fragment {

    private static PostFeedAdapter adapter;
    FirebaseDatabase database;
    DatabaseReference myRef;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;
    ArrayList<PostModule> dataModels;
    ListView listView;
    AlertDialog progressDialog;

    public PostFeedFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_post_feed, container, false);
        ConnectivityManager connectivityManager = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        progressDialog = new SpotsDialog(getActivity(), R.style.Custom);
        progressDialog.show();
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference();
        mAuth = FirebaseAuth.getInstance();

        listView = (ListView) view.findViewById(R.id.post_list);
        dataModels = new ArrayList<>();

        if (networkInfo != null && networkInfo.isConnected()) {
            myRef.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    if (dataSnapshot.hasChild("post-feed")){
//                        myRef.child("post-feed").addChildEventListener(new ChildEventListener() {
//                            @Override
//                            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
//                                PostModule module = dataSnapshot.getValue(PostModule.class);
//                                dataModels.add(new PostModule(module.getUuid(), module.getmName(), module.getmGroup(), module.getmNoofUnits(),
//                                        module.getmCountry(), module.getmCity(), module.getmHospital(), module.getmContact(),
//                                        module.getDonatedUnits(), module.getCurrentRequirement(), module.getWithinDuration(), module.getPushkey()));
//                                adapter.notifyDataSetChanged();
//                                progressDialog.dismiss();
//                            }
//
//                            @Override
//                            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
//                                PostModule module = dataSnapshot.getValue(PostModule.class);
//                                dataModels.add(new PostModule(module.getUuid(), module.getmName(), module.getmGroup(), module.getmNoofUnits(),
//                                        module.getmCountry(), module.getmCity(), module.getmHospital(), module.getmContact(),
//                                        module.getDonatedUnits(), module.getCurrentRequirement(), module.getWithinDuration(), module.getPushkey()));
//                                adapter.notifyDataSetChanged();
//                                progressDialog.dismiss();
//                            }
//
//                            @Override
//                            public void onChildRemoved(DataSnapshot dataSnapshot) {
//                                adapter.notifyDataSetChanged();
//                            }
//
//                            @Override
//                            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
//
//                            }
//
//                            @Override
//                            public void onCancelled(DatabaseError databaseError) {
//
//                            }
//                        });
                        myRef.child("post-feed").addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                adapter.clear();
                                for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){
                                    PostModule module = dataSnapshot1.getValue(PostModule.class);
                                    dataModels.add(new PostModule(module.getUuid(), module.getmName(), module.getmGroup(), module.getmNoofUnits(),
                                            module.getmCountry(), module.getmCity(), module.getmHospital(), module.getmContact(),
                                            module.getDonatedUnits(), module.getCurrentRequirement(), module.getWithinDuration(), module.getPushkey()));
                                    adapter.notifyDataSetChanged();
                                    progressDialog.dismiss();
                                }

                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {

                            }
                        });
                    }else {
                        Toast.makeText(getActivity(), "No data found!", Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }else {
            Toast.makeText(getActivity(), "No Network Connection !", Toast.LENGTH_SHORT).show();
            progressDialog.dismiss();
        }


        adapter = new PostFeedAdapter(dataModels, getContext());
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PostModule post = dataModels.get(position);
                Toast.makeText(getActivity(), "" + post.getmName(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        adapter.notifyDataSetChanged();
        super.onResume();
    }
}
