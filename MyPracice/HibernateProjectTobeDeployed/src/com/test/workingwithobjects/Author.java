package com.test.workingwithobjects;

import java.util.Set;

public class Author {

	Integer authorId;
	String authorName;
	String authorRegistration;
	Integer authorVersion;
	/**
	 * @return the authorRegistration
	 */
	public String getAuthorRegistration() {
		return authorRegistration;
	}

	/**
	 * @param authorRegistration the authorRegistration to set
	 */
	public void setAuthorRegistration(String authorRegistration) {
		this.authorRegistration = authorRegistration;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((authorName == null) ? 0 : authorName.hashCode());
		result = prime
				* result
				+ ((authorRegistration == null) ? 0 : authorRegistration
						.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (authorRegistration == null) {
			if (other.authorRegistration != null)
				return false;
		} else if (!authorRegistration.equals(other.authorRegistration))
			return false;
		return true;
	}

	Set<Book> books;

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

	/**
	 * @return the books
	 */
	public Set<Book> getBooks() {
		return books;
	}

	/**
	 * @param books
	 *            the books to set
	 */
	public void setBooks(Set<Book> books) {
		this.books = books;
	}

}
