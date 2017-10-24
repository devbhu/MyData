package com.test.interrupt;

public class ThreadController {
	

	
	public void callService(){
	     
		if(Thread.currentThread().getName().equals("First Thread"))
		ThreadService.threadService.doWork();
		else
		ThreadService.threadService.doWork2();	
		
	}
    
	
}
