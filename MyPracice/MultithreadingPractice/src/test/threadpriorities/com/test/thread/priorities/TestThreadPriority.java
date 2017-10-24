package com.test.thread.priorities;

import java.lang.Thread.UncaughtExceptionHandler;

public class TestThreadPriority {

	
	public static void main(String[] args) {
		
		Thread t1= new Thread(){
			
			@Override
			public void run() throws RuntimeException{
				System.out.println("Thread 1 running!!!");
				throw new NullPointerException("dsfsd");
			
			
		  }
		
		};
		
		t1.setName("First Thread");
		
		/*Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				
				
				System.out.println(t.getName());
				//e.printStackTrace();
			}
		});*/
		t1.start();
		
	//	t1.getThreadGroup()
	}
}
