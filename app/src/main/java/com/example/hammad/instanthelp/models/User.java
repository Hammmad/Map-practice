package com.example.hammad.instanthelp.models;

/**
 * Created by shekh chilli on 12/10/2016.
 */

public class User {
	//    public User(String uId, String fname, String lname, String emailAddress, String contact, String guardian, String country, String city, String password, String gender, Boolean volunteer, Boolean bloodDonor, String bloodGroup, Boolean firstAider, Boolean ambulance, int donatedUnits, String profileImagePath) {
//        this.uId = uId;
//        this.fname = fname;
//        this.lname = lname;
//        this.emailAddress = emailAddress;
//        this.contact = contact;
//        this.guardian = guardian;
//        this.country = country;
//        this.city = city;
//        this.password = password;
//        this.gender = gender;
//        this.volunteer = volunteer;
//        this.bloodDonor = bloodDonor;
//        this.bloodGroup = bloodGroup;
//        this.firstAider = firstAider;
//        this.ambulance = ambulance;
//        this.donatedUnits = donatedUnits;
//        this.profileImagePath = profileImagePath;
//    public User(String uId, String fname, String lname, String emailAddress, String contact, String country, String city, String password, String gender, Boolean volunteer, Boolean bloodDonor, String bloodGroup, Boolean firstAider, Boolean ambulance, String profileImagePath) {
//        this.uId = uId;
//        this.fname = fname;
//        this.lname = lname;
//        this.emailAddress = emailAddress;
//        this.contact = contact;
//        this.country = country;
//        this.city = city;
//        this.password = password;
//        this.gender = gender;
//        this.volunteer = volunteer;
//        this.bloodDonor = bloodDonor;
//        this.bloodGroup = bloodGroup;
//        this.firstAider = firstAider;
//        this.ambulance = ambulance;
//        this.profileImagePath = profileImagePath;
//    public User(String uId, String fname, String lname, String emailAddress, String country, String city, String password, Boolean volunteer, Boolean bloodDonor, String bloodGroup, Boolean firstAider, Boolean ambulance) {
//        this.uId = uId;
//        this.fname = fname;
//        this.lname = lname;
//        this.emailAddress = emailAddress;
//        this.country = country;
//        this.city = city;
//        this.password = password;
//        this.volunteer = volunteer;
//        this.bloodDonor = bloodDonor;
//        this.bloodGroup = bloodGroup;
//        this.firstAider = firstAider;
//        this.ambulance = ambulance;
//    public User(String uId, String fname, String lname, String emailAddress, String contact, String country, String city, String password, Boolean volunteer, Boolean bloodDonor, String bloodGroup, Boolean firstAider, Boolean ambulance, String profileImagePath) {
//        this.uId = uId;
//        this.fname = fname;
//        this.lname = lname;
//        this.emailAddress = emailAddress;
//        this.contact = contact;
//        this.country = country;
//        this.city = city;
//        this.password = password;
//        this.volunteer = volunteer;
//        this.bloodDonor = bloodDonor;
//        this.bloodGroup = bloodGroup;
//        this.firstAider = firstAider;
//        this.ambulance = ambulance;
//        this.profileImagePath = profileImagePath;
//    public User(String uId, String fname, String lname, String emailAddress, String contact, String country, String city, String password, String gender, Boolean volunteer, Boolean bloodDonor, String bloodGroup, Boolean firstAider, Boolean ambulance) {
//        this.uId = uId;
//        this.fname = fname;
//        this.lname = lname;
//        this.emailAddress = emailAddress;
//        this.contact = contact;
//        this.country = country;
//        this.city = city;
//        this.password = password;
//        this.gender = gender;
//        this.volunteer = volunteer;
//        this.bloodDonor = bloodDonor;
//        this.bloodGroup = bloodGroup;
//        this.firstAider = firstAider;
//        this.ambulance = ambulance;
//    public User(String uId, String emailAddress, String password, Boolean volunteer, Boolean bloodDonor, String bloodGroup, Boolean firstAider) {
//        this.uId = uId;
//        this.emailAddress = emailAddress;
//        this.password = password;
//        this.volunteer = volunteer;
//        this.bloodDonor = bloodDonor;
//        this.bloodGroup = bloodGroup;
//        this.firstAider = firstAider;
//    public User(String uId, String emailAddress, String password, Boolean volunteer, Boolean bloodDonor, String bloodGroup, Boolean firstAider, String profileImagePath) {
//        this.uId = uId;
//        this.emailAddress = emailAddress;
//        this.password = password;
//        this.volunteer = volunteer;
//        this.bloodDonor = bloodDonor;
//        this.bloodGroup = bloodGroup;
//        this.firstAider = firstAider;
//        this.profileImagePath = profileImagePath;

    public User() {
    }
	public String uId, fname, lname, emailAddress, contact, guardian, country, city, password, gender,bloodGroup;
	public Boolean volunteer;
	public Boolean bloodDonor;
	public Boolean firstAider;
	public Boolean ambulance;
	public double latitude,longitude;
    public int donatedUnits;

    public void setProfileImagePath(String profileImagePath) {
        this.profileImagePath = profileImagePath;
    }

    public String profileImagePath;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Boolean volunteer) {
        this.volunteer = volunteer;
    }

    public Boolean getBloodDonor() {
        return bloodDonor;
    }

    public void setBloodDonor(Boolean bloodDonor) {
        this.bloodDonor = bloodDonor;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Boolean getFirstAider() {
        return firstAider;
    }

    public void setFirstAider(Boolean firstAider) {
        this.firstAider = firstAider;
    }

    public Boolean getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Boolean ambulance) {
        this.ambulance = ambulance;
    }

    public String getProfileImagePath() {
        return profileImagePath;
    }

//    }

	public int getDonatedUnits() {
		return donatedUnits;
	}

	public void setDonatedUnits(int donatedUnits) {
		this.donatedUnits = donatedUnits;
	}

	public User(String uId, String fname, String lname, String emailAddress, String contact, String guardian, String country, String city, String password, String gender, Boolean volunteer, Boolean bloodDonor, String bloodGroup, Boolean firstAider, Boolean ambulance, String profileImagePath) {
		this.uId = uId;
		this.fname = fname;
		this.lname = lname;
		this.emailAddress = emailAddress;
		this.contact = contact;
		this.guardian = guardian;
		this.country = country;
		this.city = city;
		this.password = password;
		this.gender = gender;
		this.volunteer = volunteer;
		this.bloodDonor = bloodDonor;
		this.bloodGroup = bloodGroup;
		this.firstAider = firstAider;
		this.ambulance = ambulance;
		this.profileImagePath = profileImagePath;
	}

    public User(String uId, String fname, String lname, String emailAddress, String contact, int donatedUnits, String profileImagePath) {
        this.uId = uId;
        this.fname = fname;
        this.lname = lname;
        this.emailAddress = emailAddress;
        this.contact = contact;
        this.donatedUnits = donatedUnits;
        this.profileImagePath = profileImagePath;
    }

	public User(String uId, String fname, String lname, String contact, double latitude, double longitude) {
		this.uId = uId;
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
		this.latitude = latitude;
		this.longitude = longitude;
	}
}
