package test.collectionmapping.map;

import java.util.Comparator;

public class Answer {

	String answer;
	
	public Answer(String answer) {
		this.answer= answer;
	}
	
	public  Answer(){}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Answer [answer=" + answer + "]";
	}


	
}
