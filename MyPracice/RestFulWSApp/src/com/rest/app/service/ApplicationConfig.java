package com.rest.app.service;

import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig() {
		// package scanning doesn't work in Jboss for some reason
		// packages( true, "io.minh" );
		register(HelloWorldResource.class);
	}

}
