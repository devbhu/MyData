package com.test.tableperclass;


public class CreditCardPayment extends Payment {

	String creditCardType;
	
	/**
	 * @return the creditCardType
	 */
	public String getCreditCardType() {
		return creditCardType;
	}

	/**
	 * @param creditCardType
	 *            the creditCardType to set
	 */
	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

}
