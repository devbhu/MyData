package com.test.custom.semaphore;

public class TestCustomSemaphore {
	
	public static void main(String[] args) {
		
		final  CustomSemaphore semaphore = new CustomSemaphore(1);
		
		new Thread(){
			
			@Override
			public void run(){
				semaphore.acquire();
				System.out.println("Thread 1 is running");
				try {
					Thread.sleep(10000);//Thread 1 doing work for 10 secs.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				semaphore.release();
				System.out.println("Thread 1 is released");
			}
			
		}.start();
		
	new Thread(){
			
			@Override
			public void run(){
				semaphore.acquire();
				System.out.println("Thread 2 is running");
				try {
					Thread.sleep(10000);//Thread 1 doing work for 10 secs.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				semaphore.release();
				System.out.println("Thread 2 is released");
			}
			
		}.start();
		
		
	new Thread(){
			
			@Override
			public void run(){
				semaphore.acquire();
				System.out.println("Thread 3 is running");
				try {
					Thread.sleep(10000);//Thread 1 doing work for 10 secs.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				semaphore.release();
				System.out.println("Thread 3 is released");
			}
			
		}.start();
		
		
		
	new Thread(){
			
			@Override
			public void run(){
				semaphore.acquire();
				System.out.println("Thread 4 is running");
				try {
					Thread.sleep(10000);//Thread 1 doing work for 10 secs.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				semaphore.release();
				System.out.println("Thread 4 is released");
			}
			
		}.start();
		
		
	new Thread(){
			
			@Override
			public void run(){
				semaphore.acquire();
				System.out.println("Thread 5 is running");
				try {
					Thread.sleep(10000);//Thread 1 doing work for 10 secs.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				semaphore.release();
				System.out.println("Thread 5 is released");
			}
			
		}.start();
		
		
	new Thread(){
			
			@Override
			public void run(){
				semaphore.acquire();
				System.out.println("Thread 6 is running");
				try {
					Thread.sleep(10000);//Thread 1 doing work for 10 secs.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				semaphore.release();
				System.out.println("Thread 6 is released");
			}
			
		}.start();
		
		
		
	}

}
