package com.test.authentication.basic;

import java.security.Principal;

public class User implements Principal {

	private String role;

	private String userName;

	public User(String role, String userName) {
		super();
		this.role = role;
		this.userName = userName;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}



	@Override
	public String getName() {

		return userName;
	}

}
