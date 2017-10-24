package com.test.basicormapping.model;


public class BasicOrMapping {

	private Byte id;

	private Byte memeberGuide;

	public Byte getId() {
		return id;
	}

	/*public void setId(Integer id) {
		this.id = id;
	}*/

	public Byte getMemeberGuide() {
		return memeberGuide;
	}

	@Override
	public String toString() {
		return "BasicOrMapping [id=" + id + ", memeberGuide=" + memeberGuide
				+ "]";
	}

	/*public void setMemeberGuide(String memeberGuide) {
		this.memeberGuide = memeberGuide;
	}*/

}
