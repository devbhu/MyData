package com.test.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestAcquireResource{
	
	
	public static void main(String[] args) {
		
		int permit = 10;
		
		int numberOfThreads = 20;
		
		int numberOfTask=20;
		
		
		Item [] items = createItems();
		
		
		ItemAccessController itemController = new ItemAccessController(items, permit);
		
		ExecutorService execService  = Executors.newFixedThreadPool(numberOfThreads);
		
		for(int i=0;i<numberOfTask;i++)
		execService.submit(new User(itemController));
		
		
	}

	private static Item[] createItems() {
		
		Item items[]=new Item[10];
		
		for(int i=0;i<10;i++){
			
			Item item = new Item("ABC"+i, 2000+i);
			items[i]=item;
			
		}
		
		return items;
		
	}
	
	

}
