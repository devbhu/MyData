package com.test.constructor;

public class SuperClass {
	
	public SuperClass() {
		System.out.println("Super "+this);
		System.out.println("SuperClass constructor called");
		fun();
	}

	public void fun() {
		System.out.println("SuperClass fun method called");
	}

}
