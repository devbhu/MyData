package com.rest.app.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.server.model.Resource;

@Path("/helloworld")
public class HelloWorldResource {

	@GET
	public String getHello() {
		Resource.from(HelloWorldResource.class);
		return "Hello!! First Rest App";
	}

}
