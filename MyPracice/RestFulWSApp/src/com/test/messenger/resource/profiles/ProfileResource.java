package com.test.messenger.resource.profiles;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/profiles")

public class ProfileResource {
	
	@Path("/{profileName}")
	@GET
	public void getProfiles(){
		
		//to be implemented
	}

}
