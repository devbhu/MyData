package com.test.messenger.resource.messages;

import java.util.Date;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

import com.test.messenger.model.Message;
import com.test.messenger.resource.comments.CommentResource;
import com.test.messenger.resource.profiles.ProfileResource;
import com.test.messenger.services.MessageService;

@Path("/messages")
@Consumes(value = { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Produces(value = { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@RolesAllowed(value={"admin","associate"})
public class MessageResource {

	@GET
	public Response getMessages(@QueryParam("start") int start,
			@QueryParam("limit") int limit ,@Context SecurityContext context,@Context HttpServletRequest request) {
	    System.out.println(request.getSession().getId());
		System.out.println(context.isUserInRole("admin"));
		System.out.println(context.getUserPrincipal().getName());
		
		List<Message> messages = null;
		
		if (limit > 0) {

			messages= MessageService.getMessageService().getMessages(
					new Integer[] { start, limit });
			
			//return messages;
	

		}
		messages =  MessageService.getMessageService().getMessages();
		GenericEntity<List<Message>> entity = new GenericEntity<List<Message>>(messages){};
		 

		 CacheControl c = new CacheControl();
		 c.setMaxAge(120);
		 c.setPrivate(false);
		 
		return Response.ok(entity).lastModified(new Date()).build();
	//	return messages;
		
	}

	@POST
	@RolesAllowed("admin")
	public Message addMessage(List<Message> messages,@Context UriInfo uriInfo) {
		Message msgs = null;
		for (Message msg : messages){
			msgs = MessageService.getMessageService().createMessage(msg);
		    
			msgs.addLink(uriInfo.getBaseUriBuilder().path(MessageResource.class).path(MessageResource.class,"getComments").resolveTemplate("messageid", msg.getMessageId()).build().toString(),"comments");
		    msgs.addLink(uriInfo.getBaseUriBuilder().path(ProfileResource.class).path(ProfileResource.class, "getProfiles").resolveTemplate("profileName",msg.getAuthorName()).build().toString(),"profile");
		} 
		return msgs;

	}

	@PUT
	@Path("/{messageId}")
	@RolesAllowed("admin")
	public Message updateMessage(Message message,
			@PathParam("messageId") Integer messageId) {

		return MessageService.getMessageService().updateMessage(message,
				messageId);

	}

	@DELETE
	@Path("/{messageId}")
	@RolesAllowed("admin")
	public void deleteMessage(@PathParam("messageId") Integer messageId) {

		MessageService.getMessageService().deleteMessage(messageId);

	}
	
	//Implementing Sub resource . Everytime /messages/{messageid}/comments URI gets hit subresource will be given the responsibility to process the request. 
	@Path("/{messageid}/comments")
	public CommentResource getComments(){
		
		return new CommentResource();
		
	}
	
	
	

}
