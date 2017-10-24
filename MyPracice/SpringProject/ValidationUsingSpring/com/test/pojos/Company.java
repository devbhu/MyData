package com.test.pojos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import com.test.jsr.beanvalidation.PhoneNumber;
import com.test.validate.CompanyValidator;

public class Company {

	int companyId;

	@PhoneNumber
	private String phoneNumber;

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", phoneNumber="
				+ phoneNumber + ", companyName=" + companyName + "]";
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	@Autowired(required = false)
	private CompanyValidator companyValidator;

	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}
	public CompanyValidator getCompanyValidator() {
		return companyValidator;
	}

	String companyName;

	Address companyAddress;
	public String getCompanyName() {
		return companyName;
	}
	public Address getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}
	// @NotNull(message={})
	// @Min(2)
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
