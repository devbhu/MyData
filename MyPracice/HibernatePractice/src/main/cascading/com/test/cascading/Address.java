package com.test.cascading;

public class Address {

	Integer addressId;
	String residentCity;
	String residentState;
	String residentCountry;
	UsrDetails userDetails;
	Integer addressUserId;

	public Integer getAddressUserId() {
		return addressUserId;
	}

	public void setAddressUserId(Integer addressUserId) {
		this.addressUserId = addressUserId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}



	public UsrDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UsrDetails userDetails) {
		this.userDetails = userDetails;
	}

	public String getResidentCity() {
		return residentCity;
	}

	public void setResidentCity(String residentCity) {
		this.residentCity = residentCity;
	}

	public String getResidentState() {
		return residentState;
	}

	public void setResidentState(String residentState) {
		this.residentState = residentState;
	}

	public String getResidentCountry() {
		return residentCountry;
	}

	public void setResidentCountry(String residentCountry) {
		this.residentCountry = residentCountry;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", residentCity="
				+ residentCity + ", residentState=" + residentState
				+ ", residentCountry=" + residentCountry + ", userDetails="
				+ userDetails + "]";
	}



}
