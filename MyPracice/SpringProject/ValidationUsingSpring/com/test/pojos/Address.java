package com.test.pojos;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class Address {

	List<String> cities = new ArrayList<String>();
	Map<String, String> citiesMap = new HashMap<String, String>();

	{
		cities.add("Pune");
		cities.add("Bangalore");
		cities.add("Guwahati");
		cities.add("Jaipur");

		citiesMap.put("Guwahati", "0123");
		citiesMap.put("Bangalore", "02345");

	}

	Double addressId;
	
	Date addressDate;

	public Date getAddressDate() {
		return addressDate;
	}
	//@DateTimeFormat(pattern="MM-dd-yyyy",iso=Date)
	public void setAddressDate(Date addressDate) {
		this.addressDate = addressDate;
	}
	public Double getAddressId() {
		return addressId;
	}

	public void setAddressId(Double addressId) {
		this.addressId = addressId;
	}
	public Map<String, String> getCitiesMap() {
		return citiesMap;
	}
	public void setCitiesMap(Map<String, String> citiesMap) {
		this.citiesMap = citiesMap;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	@Autowired
	private MessageSource messageSource;
	private String city;
	private String country;
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressDate="
				+ addressDate + ", city=" + city + ", country=" + country
				+ ", state=" + state + "]";
	}


}
