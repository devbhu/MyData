package com.test.scheduled.threadpool;

import java.util.concurrent.Callable;

public class Task implements Runnable{
	
	long mills;
	
	public Task(long mills) {
	this.mills = mills;
	}

	/*@Override
	public Long call() throws Exception {
		int i=0;
		long start = System.currentTimeMillis();
		while(i<50000){
		
			i++;
		}
		
		return (System.currentTimeMillis()-start);
	}*/
	@Override
	public void run(){
		
		int i=0;
		
		System.out.println("start time taken : "+(System.currentTimeMillis()-mills)/1000);
		
		try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Total time taken : "+(System.currentTimeMillis()-mills)/1000);
	}

}
