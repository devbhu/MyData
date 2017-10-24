/**
 * 
 */
package com.test.pojos;

/**
 * @author vickey
 * 
 */
public class Customer {
    
	
	private String customerName;
	
	private Address customerAddress;

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
