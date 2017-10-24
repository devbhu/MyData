package com.test.threadpool;

public class TestThreadPool {
	
	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Task 1 executing!!");
				
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Task 2 executing!!");
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		
Runnable r3 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Task 3 executing!!");
				
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		
Runnable r4 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Task 4 executing!!");
				
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		
Runnable r5 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Task 5 executing!!");
				
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		
Runnable r6 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Task 6 executing!!");
				
				try {
					Thread.sleep(20000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
Runnable r7 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Task 7 executing!!");
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		};
		
		FixedThreadPool pool = new FixedThreadPool(4);
		
		pool.execute(r1);
		
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		pool.execute(r6);
		pool.execute(r7);
		pool.shutDown();
		
		
	}

}
