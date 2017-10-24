package com.test.mapping.onetoone;

public class UserDetailss {

	Integer userID;
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	String userName;
	
	UserAddress userAddress;

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

	/**
	 * @return the userAddress
	 */
	public UserAddress getUserAddress() {
		return userAddress;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDetailss [userID=" + userID + ", userName=" + userName
				+ ", userAddress=" + userAddress + "]";
	}

	/**
	 * @param userAddress the userAddress to set
	 */
	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}

	/**
	 * @return the userID
	 */
	public Integer getUserID() {
		return userID;
	}
	
}
