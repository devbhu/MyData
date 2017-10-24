package test.collectionmapping.map;

import java.util.Map;

public class Question {

	Integer questionId;
	String question;
	Integer questionVersion;
	

	/**
	 * @return the questionVersion
	 */
	public Integer getQuestionVersion() {
		return questionVersion;
	}

	/**
	 * @param questionVersion the questionVersion to set
	 */
	public void setQuestionVersion(Integer questionVersion) {
		this.questionVersion = questionVersion;
	}

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
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

/*	*//**
	 * @return the userAnswers
	 *//*
	public Map<String, String> getUserAnswers() {
		return userAnswers;
	}

	*//**
	 * @param userAnswers
	 *            the userAnswers to set
	 *//*
	public void setUserAnswers(Map<String, String> userAnswers) {
		this.userAnswers = userAnswers;
	}

	Map<String, String> userAnswers;*/
	
	Map<UserName, Answer> userAnswers;

	/**
	 * @return the userAnswers
	 */
	public Map<UserName, Answer> getUserAnswers() {
		return userAnswers;
	}

	/**
	 * @param userAnswers the userAnswers to set
	 */
	public void setUserAnswers(Map<UserName, Answer> userAnswers) {
		this.userAnswers = userAnswers;
	}
}
