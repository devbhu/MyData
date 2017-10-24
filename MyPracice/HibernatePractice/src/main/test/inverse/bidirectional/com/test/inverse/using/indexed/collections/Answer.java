package com.test.inverse.using.indexed.collections;

public class Answer {

	Integer answerID;
	String userName;


	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	Question question;

	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	public Answer() {
		// TODO Auto-generated constructor stub
	}

	public Answer(String answer) {
		this.answer = answer;
	}
	/**
	 * @return the answerID
	 */
	public Integer getAnswerID() {
		return answerID;
	}

	/**
	 * @param answerID
	 *            the answerID to set
	 */
	public void setAnswerID(Integer answerID) {
		this.answerID = answerID;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer
	 *            the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	String answer;

}
