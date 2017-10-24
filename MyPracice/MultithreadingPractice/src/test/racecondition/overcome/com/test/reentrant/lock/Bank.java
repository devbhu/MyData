package com.test.reentrant.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
	
	
    Map<Integer,Double> accountBalance = new HashMap<Integer,Double>();
    
    ReentrantLock lock = new ReentrantLock();
    {
    	
    	accountBalance.put(3890, 5000.00);
    	accountBalance.put(3891, 5000.00);
    }
    
    
    public Bank() {
		// TODO Auto-generated constructor stub
	}
    
    public  void doTransaction(int amount){
    	
    	lock.lock();
    	lock.lock();
    	lock.lock();
    	accountBalance.put(3890,accountBalance.get(3890) - amount);
    	accountBalance.put(3891,accountBalance.get(3891) + amount);
    	
    	
    	System.out.println(Thread.currentThread().getName() + " - Total balances source ->  "+accountBalance.get(3890)+" Target -> "+accountBalance.get(3891));
    	
    	
    	lock.unlock();
    	
    	try {
			Thread.currentThread().sleep(900);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	lock.unlock();
    	lock.unlock();
    	
    	System.out.println("lock got "+Thread.currentThread());
    	//sslock.unlock();
    }

}
