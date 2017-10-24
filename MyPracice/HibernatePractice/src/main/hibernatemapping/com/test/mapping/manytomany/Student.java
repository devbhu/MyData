package com.test.mapping.manytomany;

import java.util.Set;

public class Student {

	Integer studentID;
	String studentName;
	
	Set<Course> courses;

	/**
	 * @return the studentID
	 */
	public Integer getStudentID() {
		return studentID;
	}

	/**
	 * @param studentID
	 *            the studentID to set
	 */
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName
	 *            the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the courses
	 */
	public Set<Course> getCourses() {
		return courses;
	}

	/**
	 * @param courses
	 *            the courses to set
	 */
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
}
