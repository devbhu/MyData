package com.test.valuetypedobjects;

public class UsrDetails {

	
	private Integer userID;
	private String userName;
	private Address address;
	@Override
	public String toString() {
		return "UsrDetails [userID=" + userID + ", userName=" + userName
				+ ", address=" + address + "]";
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
