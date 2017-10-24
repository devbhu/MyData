package com.test.inverse.using.indexed.collections;

import java.util.Map;

public class Question {

	Integer questionId;
	String questionName;
	Map<String, Answer> userAnswers;


	/**
	 * @return the questionId
	 */
	public Integer getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId
	 *            the questionId to set
	 */
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the questionName
	 */
	public String getQuestionName() {
		return questionName;
	}

	/**
	 * @param questionName
	 *            the questionName to set
	 */
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	/**
	 * @return the userAnswers
	 */
	public Map<String, Answer> getUserAnswers() {
		return userAnswers;
	}

	/**
	 * @param userAnswers
	 *            the userAnswers to set
	 */
	public void setUserAnswers(Map<String, Answer> userAnswers) {
		this.userAnswers = userAnswers;
	}

}
