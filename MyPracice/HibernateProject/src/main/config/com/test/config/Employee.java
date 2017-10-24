package com.test.config;

public class Employee {

	Integer id;
	String employeeFirstName;
	String employeeEmail;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	private Employee() {
		// TODO Auto-generated constructor stub
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
	private String getEmployeeFirstName() {
		return employeeFirstName;
	}
	/**
	 * @param employeeFirstName
	 *            the employeeFirstName to set
	 */
	private void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	/**
	 * @return the employeeEmail
	 */
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeFirstName="
				+ employeeFirstName + ", employeeEmail=" + employeeEmail + "]";
	}
	/**
	 * @param employeeEmail
	 *            the employeeEmail to set
	 */
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
}
