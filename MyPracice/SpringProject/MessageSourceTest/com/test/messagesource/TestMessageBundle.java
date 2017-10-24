package com.test.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageBundle {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[]{"com/test/messagesource/message-context.xml"},
				new ClassPathXmlApplicationContext(
						"com/test/messagesource/parentMessage.xml"));

		MessageBundle bundle = ac.getBean("messageBundle", MessageBundle.class);
		System.out.println("Message : "
				+ bundle.getMessage().getMessage("greetings", null, "hhhh",
						Locale.FRENCH));
	}

}
