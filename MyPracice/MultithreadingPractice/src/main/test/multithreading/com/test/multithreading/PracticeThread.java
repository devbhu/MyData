package com.test.multithreading;

public class PracticeThread extends Thread{

	String value;
	
	
	
	public PracticeThread(Thread thread) {
		
		super(thread);
	}
	
	
	
	@Override
	public void run(){
	
		while(true){
			//System.out.println("sf");
		}
		//System.out.println("sdfsad");
	}
	
	public static void main(String[] args) throws InterruptedException {
	    
		PracticeThread p = new PracticeThread(null);
		System.out.println(p.getState().name());
		Thread t = new Thread(p);
		
		System.out.println(p.getState().name());
		p.setDaemon(true);
		p.start();
	//	while(true){}
		
	//	Thread.currentThread().stop();
		
		
		
		
	}
	
}
