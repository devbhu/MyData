package com.test.semaphores;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class ItemPool {
	
	private AtomicReferenceArray<Item> pool = null;
	
	private ConcurrentHashMap<Integer,Item> usedItems = null;
	
	public ItemPool(Item[] items) {
		
		pool = new AtomicReferenceArray<Item>(items);
		
		usedItems = new ConcurrentHashMap<Integer,Item>();
		
	}

	/**
	 * @return the pool
	 */
	public Item getPoolItem() {
		
	  for(int i=0;i<pool.length();i++){	
		
		Item item =  pool.get(i);
		Item item1 = null; 
		if((item1=isItemInUse(item))==null){
			
			return item;
			
		}
		
	  }
	  
	  return null;
		
	}
	
	
	public void releaseItemToPool(Item item){
		
		usedItems.remove(item.getItemId());
		
	}

	private Item isItemInUse(Item item) {
		
		return usedItems.putIfAbsent(item.getItemId(), item);
		
		
	}
	
	

}
