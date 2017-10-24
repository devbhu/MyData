package com.test.custom.countdown.latch;

public class TestCustomLatch {

	public static void main(String[] args) throws InterruptedException {
		
		final CustomCountDownLatch latch = new CustomCountDownLatch(4);
		
		new Thread(){
			@Override
			public void run(){
				
				System.out.println("Thread 1 waiting!!");
				try {
					latch.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Thread 1 released!!");
			}
			
		}.start();
		
		new Thread(){
			@Override
			public void run(){
				
				System.out.println("Thread 2 waiting!!");
				try {
					latch.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Thread 2 released!!");
			}
			
		}.start();
		
		new Thread(){
			@Override
			public void run(){
				
				System.out.println("Thread 3 waiting!!");
				try {
					latch.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Thread 3 released!!");
			}
			
		}.start();
		
		
		
		Thread.currentThread().sleep(4000);
		
		new Thread(){
			@Override
			public void run(){
				
				System.out.println("Thread 6 event completed!!");
				
					latch.countDown();
			}
			
		}.start();
		
		new Thread(){
			@Override
			public void run(){
				
				System.out.println("Thread 7 event completed!!");
				
					latch.countDown();
			}
			
		}.start();
		
		
		new Thread(){
			@Override
			public void run(){
				
				System.out.println("Thread 8 event completed!!");
				
					latch.countDown();
			}
			
		}.start();
		
		new Thread(){
			@Override
			public void run(){
				
				System.out.println("Thread 9 event completed!!");
				
					latch.countDown();
			}
			
		}.start();
		
		
		Thread.currentThread().sleep(30000);
		
		
		new Thread(){
			@Override
			public void run(){
				
				System.out.println("Thread 11 waiting!!");
				
					try {
						latch.await();
						System.out.println("Thread 11 released!!");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
		}.start();
		
		
		
		
	}
}
