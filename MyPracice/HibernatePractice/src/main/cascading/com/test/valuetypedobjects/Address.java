package com.test.valuetypedobjects;

public class Address {

	private String userCity;
	
	private String userStreet;
	
	private Long userZipCode;

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

	@Override
	public String toString() {
		return "Address [userCity=" + userCity + ", userStreet=" + userStreet
				+ ", userZipCode=" + userZipCode + "]";
	}
	
}
