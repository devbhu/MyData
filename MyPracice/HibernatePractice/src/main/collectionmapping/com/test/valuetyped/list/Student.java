package com.test.valuetyped.list;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Student {

	Integer studentID;
	String studentName;
	Collection<Activity>activities;
	/**
	 * @return the activities
	 */
	public Collection<Activity> getActivities() {
		return activities;
	}

	/**
	 * @param activities the activities to set
	 */
	public void setActivities(Collection<Activity> activities) {
		this.activities = activities;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	List<String> books;

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
	 * @return the studentName public String getStudentName() { return
	 *         studentName; } /**
	 * @param studentName
	 *            the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the books
	 */
	public List<String> getBooks() {
		return books;
	}

	/**
	 * @param books
	 *            the books to set
	 */
	public void setBooks(List<String> books) {
		this.books = books;
	}

}
