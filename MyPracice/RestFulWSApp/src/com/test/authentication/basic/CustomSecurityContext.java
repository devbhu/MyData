package com.test.authentication.basic;

import java.security.Principal;

import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;

public class CustomSecurityContext  implements SecurityContext {

	
	private String authenticationScheme;
	
	private Principal principalUser;
	
	private boolean secure;
	
	
	public CustomSecurityContext(String authenticationScheme,
			Principal principalUser,boolean secure) {
		super();
		this.authenticationScheme = authenticationScheme;
		this.principalUser = principalUser;
		this.secure = secure;
	}

	@Override
	public String getAuthenticationScheme() {
		
		return authenticationScheme;
	}

	@Override
	public Principal getUserPrincipal() {
	
		return principalUser;
	}

	@Override
	public boolean isSecure() {
		
		return secure;
	}

	@Override
	public boolean isUserInRole(String role) {
		
		return role.equals(((User)principalUser).getRole());
	}

}
