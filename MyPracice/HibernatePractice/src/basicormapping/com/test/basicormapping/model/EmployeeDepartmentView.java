package com.test.basicormapping.model;

public class EmployeeDepartmentView {

	Integer employeeId;
	String employeeName;
	String departmentName;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "EmployeeDepartmentView [employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", departmentName="
				+ departmentName + "]";
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
