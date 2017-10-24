package com.test.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamPractice {
	
	private static final List<String> strList = new ArrayList<String>();
	
	static{
		strList.add("and");
		strList.add("sun");
		strList.add("or");
		strList.add("float");
		strList.add("int");
		strList.add("andres");
	}
	
	public static void main(String[] args) {
		
		strList.stream().map((str) -> str.length())
		.filter((len) -> len >3)
		.limit(2)
		.forEach( (c) -> System.out.println(c));
		
	}
	
	

}
