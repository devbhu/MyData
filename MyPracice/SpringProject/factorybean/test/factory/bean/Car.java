package test.factory.bean;

import javax.annotation.PostConstruct;

public class Car implements Vehicle {

	 private String carName;
	 private String carNumber;
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	@PostConstruct
	public void construct(){
		
		System.out.println("Construct Car class !!!");
	}

}
