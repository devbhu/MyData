package com.test.messenger.model;



public class Link {

	private String ahref;
	private String rel;

	public Link(String ahref, String rel) {
		super();
		this.ahref = ahref;
		this.rel = rel;
	}
	
	public Link(){}

	/**
	 * @return the ahref
	 */
	public String getAhref() {
		return ahref;
	}

	/**
	 * @param ahref the ahref to set
	 */
	public void setAhref(String ahref) {
		this.ahref = ahref;
	}

	/**
	 * @return the rel
	 */
	public String getRel() {
		return rel;
	}

	/**
	 * @param rel the rel to set
	 */
	public void setRel(String rel) {
		this.rel = rel;
	}
}
