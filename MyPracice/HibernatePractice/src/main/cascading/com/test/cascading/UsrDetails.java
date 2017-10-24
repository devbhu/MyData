package com.test.cascading;

public class UsrDetails {

	
	private Integer userID;
	private String userName;

    private String userCity;
	
	private Address address;

	private String userStreet;
	
	private Long userZipCode;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "UsrDetails address= "+address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}



	
	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserStreet() {
		return userStreet;
	}

	public void setUserStreet(String userStreet) {
		this.userStreet = userStreet;
	}

	public Long getUserZipCode() {
		return userZipCode;
	}

	public void setUserZipCode(Long userZipCode) {
		this.userZipCode = userZipCode;
	}

}
