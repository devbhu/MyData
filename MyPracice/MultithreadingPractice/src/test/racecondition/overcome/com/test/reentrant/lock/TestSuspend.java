package com.test.reentrant.lock;

class Resources implements Runnable{
	
public synchronized void testSuspend(){
		
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().suspend();
		
		
	}

	@Override
	public void run() {
	
	   	
		testSuspend();
		
	}
	
	
	
	
}


public class TestSuspend {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		Resources r1= new Resources();
		
	
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		t1.setName("F1");
		t2.setName("F2");
		t3.setName("F3");
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(2000);
		
		t1.resume();
		
		
		
	}
	
}
