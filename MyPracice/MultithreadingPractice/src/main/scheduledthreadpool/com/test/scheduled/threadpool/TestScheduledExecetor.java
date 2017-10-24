package com.test.scheduled.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TestScheduledExecetor {
	
	public static void main(String[] args) throws InterruptedException {
		
	 ScheduledExecutorService	sschedService =  Executors.newScheduledThreadPool(1);
	 //Executors.newsc
	   long mills = System.currentTimeMillis();
	 sschedService.scheduleAtFixedRate(new Task(mills), 1, 5, TimeUnit.SECONDS);
	 sschedService.scheduleAtFixedRate(new Task(mills), 1, 5, TimeUnit.SECONDS);
	   
	//   sschedService.schedule(new Task(mills), 1, TimeUnit.SECONDS);
	 
	  // Thread.sleep(3000);
	 //  sschedService.scheduleAtFixedRate(new Task(mills), 1, 2, TimeUnit.SECONDS);
	   
	   //sschedService.scheduleAtFixedRate(new Task(), 1, 1, TimeUnit.SECONDS);
	 
	  // sschedService.scheduleAtFixedRate(new Task(), 1, 1, TimeUnit.SECONDS);
	 
	   
		//sschedService.shutdown();
		
	}

}
