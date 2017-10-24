package com.basic.compositeid.mapping;

import java.io.Serializable;
import java.sql.Date;

public class Employees implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1966192370685152401L;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	int id;
	
	String employeeFirstName;
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	private EmployeeCompositeId employeeCompositeId;

	public EmployeeCompositeId getEmployeeCompositeId() {
		return employeeCompositeId;
	}

	public void setEmployeeCompositeId(EmployeeCompositeId employeeCompositeId) {
		this.employeeCompositeId = employeeCompositeId;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobID() {
		return jobID;
	}

	public void setJobID(String jobID) {
		this.jobID = jobID;
	}


	String employeeEmail;
	String employeeLastName;
	Date hireDate;
	String jobID;
	String departmentID;
	String salary;

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ employeeFirstName="+""
				 + ", employeeEmail=" + employeeEmail
				+ ", employeeLastName=" + employeeLastName + ", hireDate="
				+ hireDate + ", jobID=" + jobID + "]";
	}

}
