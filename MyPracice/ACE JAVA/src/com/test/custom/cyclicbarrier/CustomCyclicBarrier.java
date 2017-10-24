package com.test.custom.cyclicbarrier;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomCyclicBarrier {
	
	private final Lock lock = new ReentrantLock();
	private final Condition visit = lock.newCondition();
	private int parties;
	private Runnable command;
	private int countParty;
	
	private static class NextPhase{
		
	  private  boolean isBarrierBroken;
		
		
	}
	
	private NextPhase phase = new NextPhase();

	public CustomCyclicBarrier(int parties,Runnable command) {
		super();
		this.parties = parties;
		this.command=command;
		this.countParty = parties;
	}
	
	public CustomCyclicBarrier(int parties) {
		super();
		this.parties = parties;
		this.countParty = parties;
	}
	
	public final void await(){
		try{
		
		lock.lock();
		
		int count = --countParty;
		
		if(phase.isBarrierBroken){
			
			throw new BarrierBrokenException();
		}
		
	    if(Thread.interrupted()){
	    	
	    	phase.isBarrierBroken = true;
	    	throw new InterruptedException();
	    	
	    }
		
		if(count==0){
			if(command!=null)
			command.run();
			reset();
			return;
		}
		
		visit.await();
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			
		 lock.unlock();
		}

	}

	public void reset() {
		try{
			
		lock.lock();
		
		releaseAndReset();
		} 
		finally{
			
	      lock.unlock();
		}
	}

	private void releaseAndReset() {
		visit.signalAll();
		countParty = parties;
		phase.isBarrierBroken = true;
		phase = new NextPhase();
	} 
	
	

}
