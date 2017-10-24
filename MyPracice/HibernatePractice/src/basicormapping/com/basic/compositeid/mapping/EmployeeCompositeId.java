package com.basic.compositeid.mapping;

import java.io.Serializable;

public class EmployeeCompositeId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7854368982965567583L;

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	int id;
	String employeeFirstName;

}
