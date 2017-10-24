package com.test.callable.futures;

import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class TestCallable {

	public static void main(String[] args) {
		
		String rootDir = "C:\\HLE-EV72\\rootdir";
		
		MonitorMatchedFiles matchedFiles = new MonitorMatchedFiles(rootDir,"New Text");
		
		FutureTask<Integer> task = new FutureTask<Integer>(matchedFiles);
		
		Thread t1 = new Thread(task);
		t1.start();
		
        
		try{
			Integer i = task.get(1,TimeUnit.DAYS);
			
			//Thread.sleep(500);
			System.out.println("Matching files found with name  "+"  New Text :  "+i);
			
		}catch(Exception ex){
			//System.out.println(task.isDone());
			ex.printStackTrace();
		}
		
	}
	
}
