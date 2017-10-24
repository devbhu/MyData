package com.test.file.sorting;

public class FileSortingResource {
	
	private static final String FILE_NAME = "D:\\JavaInterviewPractice\\ArindamPractice\\src\\ToReadFile.txt";
	
	public static void main(String[] args) {
		
		FileSortingManager manager = new FileSortingManager(FILE_NAME);
		manager.splitFile();
		
		
	}

}
