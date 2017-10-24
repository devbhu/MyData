package com.test.file.sorting;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;

public class FileSplitting {
	
	private FileSplitting(){
		
	}
	
	private static class FileSplitter{
		
		private static final FileSplitting SPLITTING = new FileSplitting();
	}
	
	public static FileSplitting getFileSplitter(){
		return FileSplitter.SPLITTING;
	}
	
	public void splitFiles(String filePath){
		
		try(RandomAccessFile fileSplit  = new RandomAccessFile(filePath,"r")) { 
			int numberPOfSplits = 10;
			long totalFileSize = fileSplit.length(); // in bytes
			long eachFileSize = totalFileSize/numberPOfSplits; // each file size in bytes. 
			long remainingFileSize = totalFileSize%numberPOfSplits;
			int i=0;
			for(;i<numberPOfSplits;i++){
				writeToFile(fileSplit, eachFileSize, i);	
			}
			
			if(remainingFileSize>0){
				writeToFile(fileSplit, remainingFileSize, i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	private void writeToFile(RandomAccessFile fileSplit, long eachFileSize,
			int i) throws FileNotFoundException, IOException {
		try(BufferedOutputStream writeToFile =  new BufferedOutputStream(new FileOutputStream("file-"+i))){
		byte toWrite [] = new byte[(int) eachFileSize];
		fileSplit.read(toWrite);
		writeToFile.write(toWrite);
		}
	}
}
