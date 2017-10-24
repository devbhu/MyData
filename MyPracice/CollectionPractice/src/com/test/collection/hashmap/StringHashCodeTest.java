package com.test.collection.hashmap;

public class StringHashCodeTest {
	
	public static void main(String[] args) {

		String r = "rumi";
		double h = 0;
		int i = 0;
		for (char a : r.toCharArray()) {
			i++;
			h += a * (Math.pow(31, r.length() - i));
		}

		System.out.println((int) h);
		
		without(r);

	}

	private static void without(String r) {
		
		
	}

}
