package com.test.prod.consumer.queue;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomBlockingQueue<E> implements CustomQueue<E> {
    
	private final Lock lock = new ReentrantLock(); 
	private final Condition notEmpty = lock.newCondition();
	private final Condition notFull = lock.newCondition();
	private final Object queue[];
	private volatile int elementIndex;
	private volatile int counter;
	private int size; 

	public CustomBlockingQueue(int size) {
		this.queue = new Object[size];
		this.size = size;
	}

	@Override
	public void put(E e) {
		try{
		lock.lock();
		while(counter==size){
			notFull.await();
		}
		insertInQueue(e);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		} 
		finally{
			lock.unlock();	
		}	
	}

	private void insertInQueue(E e) {
		queue[elementIndex++] = e;
		++counter;
		System.out.println("Putting "+e);
		notEmpty.signalAll();
	}

	@Override
	public E take() {
		E e = null;
		try{
		  	
		  lock.lock();
		  while(counter ==0){	  
			  notEmpty.await();  
		  }	
		  e=removeFromQueue();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		finally{
			lock.unlock();
		}
		return e;
	}

	private E removeFromQueue() {
		E e = (E) queue[--elementIndex];
		queue[elementIndex] = null;
		--counter;
		notFull.signalAll();
		return e;
	}
	
	

}
