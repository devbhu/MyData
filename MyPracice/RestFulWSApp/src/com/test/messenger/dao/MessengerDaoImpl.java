package com.test.messenger.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;

import com.test.messenger.model.Comment;
import com.test.messenger.model.Message;

public class MessengerDaoImpl {

	private static final Map<Integer, Message> messages;

	private static volatile MessengerDaoImpl messendaoImpl;

	/**
	 * Lazy initialized thread safe singleton.Using concept of double locking.
	 * 
	 * @return
	 */
	public static final MessengerDaoImpl getMessengerDao() {

		if (messendaoImpl == null) {

			synchronized (MessengerDaoImpl.class) {

				if (messendaoImpl == null)
					messendaoImpl = new MessengerDaoImpl();

			}

		}

		return messendaoImpl;
	}

	static {

		messages = new HashMap<Integer, Message>();
		
		Message m = new Message();
		m.setAuthorName("Vickey");
		m.setCreatedDttm(Calendar
				.getInstance().getTime());
		m.setMessage("Hi How are you?");
		m.setMessageId(1);		
		messages.put(1,m);

	}

	public boolean isMessageExistsWithID(Integer messageID) {

		return messages.containsKey(messageID);
	}

	public List<Message> getAllMessages(Integer... values) {
		List<Message> mesages = new ArrayList<Message>();
		mesages.addAll(messages.values());
		if (values.length != 0) {

			mesages = mesages.subList(values[0], values[1]);

		}

		return mesages;

	}

	public Message addMessage(Message message) {
		message.setMessageId(messages.size() + 1);
		messages.put(message.getMessageId(), message);
		return message;
	}

	public void deleteMessageByID(Integer messageId) {

		messages.remove(messageId);

	}

	public Message updateMessage(Message message, Integer messageId) {
		Message tobeUpdated = messages.get(messageId);

		if (tobeUpdated != null) {
			tobeUpdated.setAuthorName(message.getAuthorName());
			tobeUpdated.setCreatedDttm(message.getCreatedDttm());
			tobeUpdated.setMessage(message.getMessage());
			tobeUpdated.setMessageId(messageId);

		}
		return tobeUpdated;
	}

	public List<Comment> getComments(Integer messageId) {
		if (messages.containsKey(messageId))
			return messages.get(messageId).getComments();
		return Collections.emptyList();

	}

	public Comment addComment(Comment comment, Integer messageID) {

		if (messages.containsKey(messageID)) {
			int comentID = messages.get(messageID).getComments().size() + 1;
			comment.setCommentId(comentID);
			messages.get(messageID).getComments().add(comment);
			return comment;
		}

		throw new WebApplicationException(
				"Comment could not be created since message id : " + messageID
						+ " is improper!!!");

	}

	public void deleteComment(Integer commentID, Integer messageId) {

		if (messageId != 0) {
			messages.get(messageId).getComments().clear();

		} else if (!messages.get(messageId).getComments().isEmpty()
				&& commentID > 0) {

			messages.get(messageId).getComments().remove(commentID - 1);

		} else {

			throw new WebApplicationException(
					"Unable to delete the comment with commentId : "
							+ commentID);
		}

	}

	public Comment updateComment(Integer messageId, Integer commentid,
			Comment toBeUpdated) {
		Comment comment = null;
		if (messages.containsKey(messageId) && commentid > 0) {

			comment = messages.get(messageId).getComments().get(commentid - 1);

			if (comment != null) {

				comment.setCommentDttm(toBeUpdated.getCommentDttm());
				comment.setCommentedBy(toBeUpdated.getCommentedBy());
				comment.setCommentId(commentid);
				comment.setCommentText(toBeUpdated.getCommentText());
				return comment;
			}
		}

		throw new WebApplicationException(
				"Comment could not be updated due to imprroper messageId or comment id . Please verify the mesage id / comment id");
	}

}
