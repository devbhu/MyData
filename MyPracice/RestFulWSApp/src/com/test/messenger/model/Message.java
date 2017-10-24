package com.test.messenger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement
public class Message {

	private String message;
	private Integer messageId;
	private Date createdDttm;
	private String authorName;
	private List<Comment>comments  = new ArrayList<Comment>();
	private List<Link>links = null;
	

	/**
	 * @return the comments
	 */
	@XmlTransient
	public List<Comment> getComments() {
		return comments;
	}

	/**
	 * @return the links
	 */
	public List<Link> getLinks() {
		return links;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Message(String message, Integer messageId, Date createdDttm,
			String authorName) {
		super();
		this.message = message;
		this.messageId = messageId;
		this.createdDttm = createdDttm;
		this.authorName = authorName;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the messageId
	 */

	public Integer getMessageId() {
		return messageId;
	}

	/**
	 * @param messageId
	 *            the messageId to set
	 */
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	/**
	 * @return the createdDttm
	 */
	public Date getCreatedDttm() {
		return createdDttm;
	}

	/**
	 * @param createdDttm
	 *            the createdDttm to set
	 */
	public void setCreatedDttm(Date createdDttm) {
		this.createdDttm = createdDttm;
	}

	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * @param links the links to set
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}

	/**
	 * @param authorName
	 *            the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Message() {
		links = new ArrayList<Link>();

	}

	public void addLink(String ahref,String rel){
		
		links.add(new Link(ahref,rel));
		
	}
	
}
