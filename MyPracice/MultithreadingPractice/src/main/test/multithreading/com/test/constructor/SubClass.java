package com.test.constructor;

public class SubClass extends SuperClass{

	
	public SubClass() {
		super();
		System.out.println("sub "+this);
		System.out.println("SubClass constructor called");
		fun();
	}

	@Override
	public void fun() {
		System.out.println("SubClass Fun method called");
	}


}
