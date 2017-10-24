package com.test.autowiring.beans;

import com.test.pojos.Inter;

public class  AutoDetectTest{

	Inter inter;
	
	private AutoDetectTest() {
		
		this.inter = inter;
		
	}
	
	

	public Inter getInter() {
		return inter;
	}



	public void setInter(Inter inter) {
		this.inter = inter;
	}



	@Override
	public String toString() {
		
		return "[  "+inter+"  ]";
	}
	
}
