package com.test.onetomany;

public class Address {

	Integer addressID;

	String city;
	String state;

	Integer employeeId;

	/**
	 * @return the addressID
	 */
	public Integer getAddressID() {
		return addressID;
	}

	/**
	 * @param addressID
	 *            the addressID to set
	 */
	public void setAddressID(Integer addressID) {
		this.addressID = addressID;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

}
