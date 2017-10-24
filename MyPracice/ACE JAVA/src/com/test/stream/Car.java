package com.test.stream;

import java.util.Calendar;

public class Car {
	
	public Car(String carName, String carColor, boolean isAutomatic,Calendar manufacturedDate,Double price,int i) {
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.isAutomatic = isAutomatic;
		this.manufacturedDate = manufacturedDate;
		this.price = price;
		setCompany(i);
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(int i) {
		if(i%2==0)
		this.company = "BMW";
		else
		this.company = "Mercedez";	
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	String carName;
	String carColor;
	boolean isAutomatic;
	Calendar manufacturedDate;
	Double price;
	String company;
    
	
	
	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}

	public Calendar getManufacturedDate() {
		return manufacturedDate;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public boolean isAutomatic() {
		return isAutomatic;
	}
	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

}
