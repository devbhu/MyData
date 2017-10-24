package com.test.messenger.services;

import java.util.List;

import com.test.messenger.dao.MessengerDaoImpl;
import com.test.messenger.model.Message;

public class MessageService {

	public static volatile MessageService messageService;

	/**
	 * Lazy initialized thread safe singleton.Using concept of double locking.
	 * 
	 * @return the messageService
	 */
	public static MessageService getMessageService() {

		if (messageService == null) {

			synchronized (MessageService.class) {

				if (messageService == null)
					messageService = new MessageService();

			}

		}

		return messageService;
	}

	public Message createMessage(Message message) {

		return MessengerDaoImpl.getMessengerDao().addMessage(message);
	}

	public void deleteMessage(Integer messageId) {

		MessengerDaoImpl.getMessengerDao().deleteMessageByID(messageId);

	}

	public Message updateMessage(Message message,Integer messageId) {

		return MessengerDaoImpl.getMessengerDao().updateMessage(message,messageId);
	}

	public List<Message> getMessages(Integer ...values) {

		return MessengerDaoImpl.getMessengerDao().getAllMessages(values);

	}
	
	

}
