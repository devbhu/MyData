package com.test.file.sorting;

public class FileSortingManager {

	private String fileName;

	public FileSortingManager(String fileName) {
		this.fileName = fileName;
	}
	
	public void splitFile(){
		
		FileSplitting.getFileSplitter().splitFiles(fileName);
		
	} 
	
}
