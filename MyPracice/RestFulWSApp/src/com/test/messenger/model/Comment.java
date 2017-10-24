package com.test.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Comment {

	Integer commentId;
	String commentText;
	String commentedBy;
	Date commentDttm;
	Integer messageId;

	public Comment(Integer commentId, String commentText, String commentedBy,
			Date commentDttm, Integer messageId) {
		super();
		this.commentId = commentId;
		this.commentText = commentText;
		this.commentedBy = commentedBy;
		this.commentDttm = commentDttm;
		this.messageId = messageId;
	}

	/**
	 * @return the messageId
	 */
	@XmlTransient
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

	public Comment() {

	}

	/**
	 * @return the commentId
	 */
	public Integer getCommentId() {
		return commentId;
	}

	/**
	 * @return the commentText
	 */
	public String getCommentText() {
		return commentText;
	}

	/**
	 * @param commentId
	 *            the commentId to set
	 */
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	/**
	 * @param commentText
	 *            the commentText to set
	 */
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	/**
	 * @param commentedBy
	 *            the commentedBy to set
	 */
	public void setCommentedBy(String commentedBy) {
		this.commentedBy = commentedBy;
	}

	/**
	 * @param commentDttm
	 *            the commentDttm to set
	 */
	public void setCommentDttm(Date commentDttm) {
		this.commentDttm = commentDttm;
	}

	/**
	 * @return the commentedBy
	 */
	public String getCommentedBy() {
		return commentedBy;
	}

	/**
	 * @return the commentDttm
	 */
	public Date getCommentDttm() {
		return commentDttm;
	}

}
