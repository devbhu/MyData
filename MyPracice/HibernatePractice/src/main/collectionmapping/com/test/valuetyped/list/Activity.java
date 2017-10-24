package com.test.valuetyped.list;

public class Activity {

	String activityName;
	Integer practiceHours;

	/**
	 * @return the activityName
	 */
	public String getActivityName() {
		return activityName;
	}
public Activity() {
	// TODO Auto-generated constructor stub
}

public Activity(String activityName,Integer practiceHours){
	
	this.activityName=activityName;
	this.practiceHours=practiceHours;
}
	/**
	 * @param activityName
	 *            the activityName to set
	 */
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	/**
	 * @return the practiceHours
	 */
	public Integer getPracticeHours() {
		return practiceHours;
	}

	/**
	 * @param practiceHours
	 *            the practiceHours to set
	 */
	public void setPracticeHours(Integer practiceHours) {
		this.practiceHours = practiceHours;
	}

}
