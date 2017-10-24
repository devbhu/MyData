package com.test.interrupt;

public class StopThread extends Thread {

	
	ThreadController controller;
	Thread thread;
	
	public StopThread(Thread thread,ThreadController controller) {
		
		this.thread = thread;
		this.controller = controller;
		
	}

	/**
	 * @return the thread
	 */
	public Thread getThread() {
		return thread;
	}
	
	
	@Override
	public void run(){
		
		
		controller.callService();
		
	}
}
