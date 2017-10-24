package com.test.reentrant.lock;

import java.util.ArrayList;
import java.util.List;


class TestThread implements Runnable{
    
	Bank b ;
	
	public TestThread(Bank b) {
		// TODO Auto-generated constructor stub
		this.b = b;
	}
	
	@Override
	public void run() {
	
		
		b.doTransaction(30);
	}
	
	
	
}


public class TestReentrantToremoveRace {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		final Bank b= new Bank();
		List<Thread>threads = new ArrayList<Thread>();
		
		
		for(int i=1;i<=10;i++){
			
			Thread t = new Thread(new TestThread(b));
			
			t.setName("Thread --"+i);
			t.start();
			threads.add(t);
			
		}
		
		Thread.sleep(500);
		
		System.out.println(threads.get(6).getState().name());
		
		
	}
	
}
