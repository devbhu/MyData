package com.game.player;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiceGameController {
	
	private  Lock lock = null;
	
	private  Condition cond = null;
	
	public DiceGameController() {
		
		lock = new ReentrantLock();
		cond = lock.newCondition();
	}
	
    public void taskPerPlayer(){
    	
    	try{
    	
    	lock.lock();
    	cond.signalAll();
    	System.out.println(Thread.currentThread().getName() + " has started playing and has scored a number : "+ ((Player)Thread.currentThread()).getDiceValue());
       
       	cond.await();
       	
    	} catch(Exception ex){
    		
    		ex.printStackTrace();
    	}
    	
    	finally{
    	  cond.signalAll();
    	  lock.unlock();		
    	}
    	
    	
    }
	

}
