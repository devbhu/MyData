/**
 * 
 */
package com.test.persistent.collection;

import java.util.Set;

/**
 * @author ASanyal
 *
 */
public class Author {

	Integer authorId;
	String authorName;
	Set<Books>books;

	/**
	 * @return the books
	 */
	public Set<Books> getBooks() {
		return books;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(Set<Books> books) {
		this.books = books;
	}

	/**
	 * @return the authorId
	 */
	public Integer getAuthorId() {
		return authorId;
	}

	/**
	 * @param authorId
	 *            the authorId to set
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
	 * @param authorName
	 *            the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}
