package com.test.hibernate.mapping.models;

public  class Countries {

	private String countryId;
	private String countryName;
	private Region region;
	
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
/* @Override
	public String toString() {
		return "Countries [countryId=" + countryId + ", countryName="
				+ countryName + ", region=" + region + "]";
	}*/
	
}
