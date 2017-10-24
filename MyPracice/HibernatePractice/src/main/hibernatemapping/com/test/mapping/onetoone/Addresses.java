package com.test.mapping.onetoone;

public class Addresses {

	Long addressId;
	String residentCity;
	String residentState;
	String residentCountry;
	UserDetailss userDetails;
	public UserDetailss getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetailss userDetails) {
		this.userDetails = userDetails;
	}
	
	@Override
	public String toString() {
		return "Addresses [addressId=" + addressId + ", residentCity="
				+ residentCity + ", residentState=" + residentState
				+ ", residentCountry=" + residentCountry + ", userDetails="
				+ userDetails + ", addressUserId=" + addressUserId + "]";
	}

	String addressUserId;
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
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
	public String getAddressUserId() {
		return addressUserId;
	}
	public void setAddressUserId(String addressUserId) {
		this.addressUserId = addressUserId;
	}
	
}
