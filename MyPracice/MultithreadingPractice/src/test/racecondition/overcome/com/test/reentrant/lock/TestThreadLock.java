package com.test.reentrant.lock;

public class TestThreadLock {

	
	
	public synchronized void fun(){
		
		System.out.println("fun");
		while(true){}
	}
	
	

	public  void fun1(){
		
		System.out.println("fun1");
		
	}
	
	
	
	public static void main(String[] args) {
		
		final TestThreadLock tc = new TestThreadLock();
		
		Thread t = new Thread(){
			
			@Override
			public void run(){
				tc.fun();
				
				
			}
			
		};
		
Thread t1 = new Thread(){
			
			@Override
			public void run(){
				tc.fun1();
				
				
			}
			
		};
		
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
	}
	
}
