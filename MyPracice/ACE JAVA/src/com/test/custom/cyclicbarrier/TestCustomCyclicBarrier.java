package com.test.custom.cyclicbarrier;

public class TestCustomCyclicBarrier {
	
	public static void main(String[] args) throws InterruptedException {
		
		final CustomCyclicBarrier barrier = new CustomCyclicBarrier(5,new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("All the threads joined game begin!!");
			}
		});
		
		
		Thread t1 = new Thread(){
			
			@Override
			public void run() {
				barrier.await();
				System.out.println("Thread1");
				
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		};
		
		
	Thread t2 = new Thread(){
			
			@Override
			public void run() {
				barrier.await();
				System.out.println("Thread2");
			
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		};
		
		
	Thread t3 = new Thread(){
			
			@Override
			public void run() {
				
				
				barrier.await();
				System.out.println("Thread3");
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		};
		
		
	Thread t4 = new Thread(){
			
			@Override
			public void run() {
				
				
				barrier.await();
				System.out.println("Thread4");
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		};
		
		
		
	Thread t5 = new Thread(){
			
			@Override
			public void run() {
				
				
				try {
					Thread.sleep(20000);
					barrier.await();
					System.out.println("Thread5");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		};
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	Thread.currentThread().sleep(60000);	
		
		
 new Thread(){
			
			@Override
			public void run() {
				
				
				try {
					Thread.sleep(20000);
					barrier.await();
					System.out.println("Thread5");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}.start();
		
		barrier.reset();
		
		Thread.sleep(10000);
new Thread(){
			
			@Override
			public void run() {
				
				
				try {
					Thread.sleep(20000);
					barrier.await();
					System.out.println("Thread8");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}.start();
		
		
	}

}
