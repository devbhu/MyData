package com.test.reentrant.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UsingTryLock implements Runnable{
	
	final Lock lock = new ReentrantLock();
	
    void  testLocks1(){
    	
    	try {
			if(lock.tryLock(30,TimeUnit.SECONDS)){
			
			System.out.println("Locked acquired :" +Thread.currentThread().getName());
			while(true){}
			
			} else{
				
				 System.out.println("Locked not acquired "+Thread.currentThread().getName());
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	synchronized void  testLocks(){
		
	    System.out.println(Thread.currentThread().getName());
		while(true){}
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		UsingTryLock u1 = new UsingTryLock();
		
		Thread t1 = new Thread(u1);
		Thread t2 = new Thread(u1);
		Thread t3 = new Thread(u1);
		t1.setName("F1");
		t2.setName("F2");
		t1.start();
		t2.start();
		//t3.start();
		
		t2.interrupt();
		Thread.sleep(500);
		System.out.println(t2.getState().name());
		
		
	}

	@Override
	public void run() {
		
		testLocks1();
		
		
	}
	
	

}
