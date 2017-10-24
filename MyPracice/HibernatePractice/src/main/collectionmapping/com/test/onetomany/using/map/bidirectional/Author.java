package com.test.onetomany.using.map.bidirectional;

import java.util.Map;

public class Author {

	Integer authorId;
	String authorName;
	Map<Integer,Book> books;
	/**
	 * @return the authorId
	 */
	public Integer getAuthorId() {
		return authorId;
	}
	/**
	 * @param authorId the authorId to set
	 */
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	/**
	 * @return the books
	 */
	public Map<Integer, Book> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(Map<Integer, Book> books) {
		this.books = books;
	}
	
	
	
}
