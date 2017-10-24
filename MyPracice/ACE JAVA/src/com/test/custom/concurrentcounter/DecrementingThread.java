package com.test.custom.concurrentcounter;

public class DecrementingThread extends Thread{
	
	private AtomicCounter counter;
	
	public DecrementingThread(AtomicCounter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		counter.decrementAndGet();
	}
}
