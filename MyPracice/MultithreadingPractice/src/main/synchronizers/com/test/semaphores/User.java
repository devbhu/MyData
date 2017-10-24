package com.test.semaphores;

public class User implements Runnable{
	
	
	private ItemAccessController itemController;
	
	
	public User(ItemAccessController itemController) {
		super();
		this.itemController = itemController;
	}


	@Override
	public void run(){
		
		itemController.accessPooledItems();
		
	}

}
