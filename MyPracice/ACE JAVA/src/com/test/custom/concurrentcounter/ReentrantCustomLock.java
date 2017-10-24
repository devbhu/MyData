package com.test.custom.concurrentcounter;

public class ReentrantCustomLock implements CustomLock{
	
    private volatile int holdLock;
    private volatile long threadId;
	
    @Override
	public synchronized void lock() {
    	
    	if(holdLock==0){
    		++holdLock;
    		threadId = Thread.currentThread().getId();

    	} else if(holdLock >0 && Thread.currentThread().getId() == threadId){
    		
    		++holdLock;
    		
    	} else{
    		try {
				wait();
				++holdLock;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		
    	}	
	}

	@Override
	public synchronized boolean trylock() {
		boolean acquired = false;
		if(holdLock == 0){		
			acquired = true;
		}
		return acquired;
	}

	@Override
	public synchronized void unlock() {
		if(holdLock >0){
		--holdLock;
		if(holdLock==0)
		notify();
		}
	}
	

}
