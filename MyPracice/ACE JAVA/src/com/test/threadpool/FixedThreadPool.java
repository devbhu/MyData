package com.test.threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;


public class FixedThreadPool implements ThreadPool{
	
	private  final BlockingQueue<Runnable> referenceQueue = new LinkedBlockingQueue<>();
	
	private  final AtomicInteger counter = new AtomicInteger(0);
	
	private Thread[] poolThreads ;
	
	private final int poolSize;
	
	private volatile boolean flag = true;
	
	public FixedThreadPool(int poolSize){
		
		poolThreads = new Thread[poolSize];
		this.poolSize = poolSize;
	}

	@Override
	public void execute(Runnable task) {
		if(flag){
		if(counter.get() < poolSize){
			
			poolThreads[counter.get()] = new PoolThread();
		
			poolThreads[counter.getAndIncrement()].start();
			
		}
		
		try {
			referenceQueue.put(task);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

	@Override
	public void shutDown() {
	    flag = false;
	}
	
	private class PoolThread extends Thread{

		@Override
		public void run() {
			
			while(true){
				
				try {
                  
					if(!flag && referenceQueue.isEmpty()){
						
						break;
						
					}
					Runnable task = referenceQueue.take();
					task.run();
					
					
				} catch (InterruptedException e) {
				    e.printStackTrace();
				}
				
			}
		}
			
		
	}
}
