package com.test.tableperclass;

import java.math.BigDecimal;

public class Payment {

	private Integer paymentDetailsId;

	private BigDecimal amount;

	private Payment paymentDetails;

	/**
	 * @return the paymentDetails
	 */
	public Payment getPaymentDetails() {
		return paymentDetails;
	}

	/**
	 * @param paymentDetails
	 *            the paymentDetails to set
	 */
	public void setPaymentDetails(Payment paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	/**
	 * @return the paymentDetailsId
	 */
	public Integer getPaymentDetailsId() {
		return paymentDetailsId;
	}

	/**
	 * @param paymentDetailsId
	 *            the paymentDetailsId to set
	 */
	public void setPaymentDetailsId(Integer paymentDetailsId) {
		this.paymentDetailsId = paymentDetailsId;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
