package com.test.custom.concurrentcounter;

public interface CustomLock {
	
	void lock();
	boolean trylock();
	void unlock();

}
