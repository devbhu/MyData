package com.test.persist;

import java.sql.Date;

public final class Employee implements EmployeeInter{
	Integer id;
	String employeeFirstName;
	String employeeEmail;
	Date hireDate;
	String jobID;
	
	
	
	/**
	 * @return the jobID
	 */
	public String getJobID() {
		return jobID;
	}
	/**
	 * @param jobID
	 *            the jobID to set
	 */
	public void setJobID(String jobID) {
		this.jobID = jobID;
	}
	/**
	 * @return the hireDate
	 */
	public Date getHireDate() {
		return hireDate;
	}
	/**
	 * @param hireDate
	 *            the hireDate to set
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	/**
	 * @return the employeeLastName
	 */
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	/**
	 * @param employeeLastName
	 *            the employeeLastName to set
	 */
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	String departmentID;
	String salary;
	String employeeLastName;

	/**
	 * @return the departmentID
	 */
	public String getDepartmentID() {
		return departmentID;
	}
	/**
	 * @param departmentID
	 *            the departmentID to set
	 */
	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}
	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}
	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the employeeFirstName
	 */
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	/**
	 * @param employeeFirstName
	 *            the employeeFirstName to set
	 */
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	/**
	 * @return the employeeEmail
	 */
	public String getEmployeeEmail() {
		return employeeEmail;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeFirstName="
				+ employeeFirstName + ", employeeEmail=" + employeeEmail
				+ ", hireDate=" + hireDate + ", jobID=" + jobID
				+ ", departmentID=" + departmentID + ", salary=" + salary
				+ ", employeeLastName=" + employeeLastName + "]";
	}
	/**
	 * @param employeeEmail
	 *            the employeeEmail to set
	 */
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

}
