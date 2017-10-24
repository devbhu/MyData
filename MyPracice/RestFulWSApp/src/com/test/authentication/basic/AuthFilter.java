package com.test.authentication.basic;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.internal.util.Base64;




@Provider
@PreMatching
public class AuthFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext containerRequest)
			throws IOException {
            
		
		
	/*String credentials = Base64.decodeAsString(containerRequest
				.getHeaderString("Authorization").split(" ")[1]);*/
       
		SecurityContext context = containerRequest.getSecurityContext();
		
		//String userName = credentials.split(":")[0];
		
		
		
		
		/*User u = null;
		
		if("vickey".equalsIgnoreCase(userName)){
			
			u = new User("associate", credentials.split(":")[0]);
			
		} else{
			
			u = new User("admin", credentials.split(":")[0]);
		}
		*/
		User u = null;
		u = new User("admin", "");
		CustomSecurityContext customContext  = new CustomSecurityContext(context.getAuthenticationScheme(), u, context.isSecure());
		
		containerRequest.setSecurityContext(customContext);
	
	}

}
