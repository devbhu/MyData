package com.test.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

class Resource extends Thread{
	
	
	CountDownLatch latch;
	TestCountDownLatch testLatch;
	
	public Resource(CountDownLatch latch,TestCountDownLatch testLatch) {
		
		this.latch=latch;
		this.testLatch=testLatch;
	}
	
	@Override
	public void run(){
		
		startWork();
		
	}
	
	
	private void startWork(){
		
		try {
			System.out.println(Thread.currentThread().getName()+" has done the work "+testLatch.getValue());
			latch.await();
			System.out.println(Thread.currentThread().getName()+" has done the work "+testLatch.getValue());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class TestCountDownLatch {
	
	AtomicBoolean atomicBoolean = new AtomicBoolean();
	
	public boolean getValue(){
		
		return atomicBoolean.get();
	}
	
	public void setValue(boolean val){
		
		atomicBoolean.set(val);
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		TestCountDownLatch testLatch = new TestCountDownLatch();
		
		CountDownLatch latch = new CountDownLatch(2);
		
		Resource res = new Resource(latch, testLatch);
		
		Resource res1 = new Resource(latch, testLatch);
		
		Resource res2 = new Resource(latch, testLatch);
		
		res.start();
		
		res1.start();
		res2.start();
		
		Thread.sleep(10000);
		testLatch.setValue(true);
		latch.countDown();
		
	}

}
