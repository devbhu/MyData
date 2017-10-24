package com.test.mapping.onetoone;

public class UserAddress {
	
	/**
	 * @return the addressId
	 */
	public Integer getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	String userCity;
	String userStreet;
	Long userZipCode;
	Long userAddressId;
	UserDetailss userDetails;
	Integer addressId;
	
	/**
	 * @return the userDetails
	 */
	public UserDetailss getUserDetails() {
		return userDetails;
	}
	/**
	 * @param userDetails the userDetails to set
	 */
	public void setUserDetails(UserDetailss userDetails) {
		this.userDetails = userDetails;
	}
	/**
	 * @return the userCity
	 */
	public String getUserCity() {
		return userCity;
	}
	/**
	 * @param userCity the userCity to set
	 */
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	/**
	 * @return the userStreet
	 */
	public String getUserStreet() {
		return userStreet;
	}
	/**
	 * @param userStreet the userStreet to set
	 */
	public void setUserStreet(String userStreet) {
		this.userStreet = userStreet;
	}
	/**
	 * @return the userZipCode
	 */
	public Long getUserZipCode() {
		return userZipCode;
	}
	/**
	 * @param userZipCode the userZipCode to set
	 */
	public void setUserZipCode(Long userZipCode) {
		this.userZipCode = userZipCode;
	}
	/**
	 * @return the userAddressId
	 */
	public Long getUserAddressId() {
		return userAddressId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserAddress [userCity=" + userCity + ", userStreet="
				+ userStreet + ", userZipCode=" + userZipCode
				+ ", userAddressId=" + userAddressId + "]";
	}
	/**
	 * @param userAddressId the userAddressId to set
	 */
	public void setUserAddressId(Long userAddressId) {
		this.userAddressId = userAddressId;
	}
	
	

}
