package com.test.handle.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MessengerExceptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable arg0) {
		
		
		
		return Response.accepted().status(Response.Status.EXPECTATION_FAILED).type(MediaType.TEXT_HTML).entity(arg0.getMessage()).build();
		
	}

}
