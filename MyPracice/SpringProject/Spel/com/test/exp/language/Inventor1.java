package com.test.exp.language;

import java.util.Date;

public class Inventor1 {
	private String name1;
	private Date dateOfBirth;
	private String nameFromMap;
	private String city;
	
	
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the nameFromMap
	 */
	public String getNameFromMap() {
		return nameFromMap;
	}
	/**
	 * @param nameFromMap the nameFromMap to set
	 */
	public void setNameFromMap(String nameFromMap) {
		this.nameFromMap = nameFromMap;
	}
	public Inventor1(String name1,Date dateOfBirth,String city) {
		this.name1 = name1;
		this.dateOfBirth = dateOfBirth;
		this.city=city;
	}
public Inventor1() {
	System.out.println("inventor 1 initialized ");
}
   public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public static Double value(){
		
		return 20d;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return getCity().equals(((Inventor1)obj).city);
	}
	
	@Override
	public int hashCode() {
		return getCity().hashCode();
	}
	
public Double value1(){
		
		return 30d;
		
	}
	
}
