package com.test.interrupt;

public class StartThread extends Thread{
	
	
	ThreadController controller;

	public StartThread(ThreadController controller) {
		super();
		this.controller = controller;
	}

	@Override
	public void run(){
		
		
		controller.callService();
		
	}

	/**
	 * @return the controller
	 */
	public ThreadController getController() {
		return controller;
	}
	
}
