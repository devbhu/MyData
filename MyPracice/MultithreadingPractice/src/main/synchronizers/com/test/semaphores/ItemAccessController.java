package com.test.semaphores;

import java.util.concurrent.Semaphore;

public class ItemAccessController {
	
	
	private ItemPool pool;
	
	private Semaphore semaphore;
	
	public ItemAccessController(Item[] items,int permits) {
		
		pool  = new ItemPool(items);
		semaphore = new Semaphore(permits,true);
	}
	
	
	public void accessPooledItems(){
		
		try{
			
		semaphore.acquire();
		
		doWork();
		
		} catch(Exception ex){
			
			
			ex.printStackTrace();
			
		} 
		finally{
			
			semaphore.release();
		}
		
		
	}


	private void doWork() throws InterruptedException {
		
		Item item = pool.getPoolItem();
		
        if(item!=null){
        	
        	System.out.println(Thread.currentThread().getName() + " has acquired the item from pool  "+item);
        	
        	Thread.sleep(1000);
        	
            pool.releaseItemToPool(item);
            
            System.out.println(Thread.currentThread().getName() + " has released the item to pool  "+item);
            
        } else{
        	
        	System.out.println(Thread.currentThread().getName() + " could not able to acquire any items as all are been used currently !!!");
        }
		
	}

}
