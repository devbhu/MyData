package com.test.workingwithobjects;

public class AuthorDetails {
	
	Integer authorDetailsId;
	String authorCity;
	Author author;
	/**
	 * @return the authorDetailsId
	 */
	public Integer getAuthorDetailsId() {
		return authorDetailsId;
	}
	/**
	 * @param authorDetailsId the authorDetailsId to set
	 */
	public void setAuthorDetailsId(Integer authorDetailsId) {
		this.authorDetailsId = authorDetailsId;
	}
	/**
	 * @return the authorCity
	 */
	public String getAuthorCity() {
		return authorCity;
	}
	/**
	 * @param authorCity the authorCity to set
	 */
	public void setAuthorCity(String authorCity) {
		this.authorCity = authorCity;
	}
	/**
	 * @return the author
	 */
	public  Author getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}
	public AuthorDetails() {
		// TODO Auto-generated constructor stub
	}

}
