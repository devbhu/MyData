package com.test.messenger.resource.comments;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.test.messenger.dao.MessengerDaoImpl;
import com.test.messenger.model.Comment;

@Path("/")
public class CommentResource {

	
	@GET
	public List<Comment>getComments(@PathParam("messageid") Integer messageId){
		
		return MessengerDaoImpl.getMessengerDao().getComments(messageId);
		
	}
	
	@POST
	@RolesAllowed("admin")
	public Comment addComment(Comment comment,@PathParam("messageid") Integer messageId){
		
		return MessengerDaoImpl.getMessengerDao().addComment(comment,messageId);
		
	}
	
	@DELETE
	@Path("/{commentid}")
	@RolesAllowed("admin")
	public void deleteComment(@PathParam("messageid") Integer messageId,@PathParam("commentid")Integer commentID){
		
		MessengerDaoImpl.getMessengerDao().deleteComment(commentID, messageId);
		
	}
	
	@PUT
	@Path("/{commentid}")
	@RolesAllowed("admin")
	public Comment updateMessage(@PathParam("messageid") Integer messageId,@PathParam("commentid")Integer commentID,Comment comment){
		
		
		return MessengerDaoImpl.getMessengerDao().updateComment(messageId, commentID, comment);
		
	}
	
	
}
