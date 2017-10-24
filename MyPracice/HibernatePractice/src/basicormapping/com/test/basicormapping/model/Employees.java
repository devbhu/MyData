package com.test.basicormapping.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Employees {

	private Timestamp lastUpdatedDttm;
	private Integer versionId;

	public Timestamp getLastUpdatedDttm() {
		return lastUpdatedDttm;
	}

	public void setLastUpdatedDttm(Timestamp lastUpdatedDttm) {
		this.lastUpdatedDttm = lastUpdatedDttm;
	}

	private Long sumSalary;

	public Long getSumSalary() {
		return sumSalary;
	}

	public void setSumSalary(Long sumSalary) {
		this.sumSalary = sumSalary;
	}

	private Boolean empType;

	public Boolean getEmpType() {
		return empType;
	}

	public void setEmpType(Boolean empType) {
		this.empType = empType;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
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
	String employeeEmail;
	String employeeLastName;
	Date hireDate;
	String jobID;
	String departmentID;
	Integer salary;

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [lastUpdatedDttm=" + lastUpdatedDttm + ", versionId="
				+ versionId + ", sumSalary=" + sumSalary + ", empType="
				+ empType + ", id=" + id + ", employeeFirstName="
				+ employeeFirstName + ", employeeEmail=" + employeeEmail
				+ ", employeeLastName=" + employeeLastName + ", hireDate="
				+ hireDate + ", jobID=" + jobID + ", departmentID="
				+ departmentID + ", salary=" + salary + "]";
	}

}
