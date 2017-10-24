package com.test.semaphores;

import java.util.concurrent.Semaphore;


class Resource extends Thread{
	
	private Semaphore semaphore;
	
	public Resource(Semaphore semaphore) {
		this.semaphore=semaphore;
	}
	
	@Override
	public void run(){
		
		criticalSection();
		
	}
	
  public void criticalSection(){
		
		for(int i=0;i<2;i++){
			
			
			try {
				
				//System.out.println("called "+Thread.currentThread().getName()+"-->"+i);
				semaphore.acquire();
				System.out.println("acquired "+Thread.currentThread().getName()+"-->"+i);
				Thread.sleep(3000);
				semaphore.release();
				System.out.println("Released "+Thread.currentThread().getName()+"-->"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}

public class TestSemaphore {

	final static Semaphore semaphore = new Semaphore(1, false);
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Resource r1 = new Resource(semaphore);
		Resource r2 = new Resource(semaphore);
		Resource r3 = new Resource(semaphore);
		Resource r4 = new Resource(semaphore);
		Resource r5 = new Resource(semaphore);
		r1.start();
		r2.start();
		r3.start();
		//r4.start();
		//r5.start();
		
		
	}
	
	
	
	
}
