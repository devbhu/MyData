package com.test.custom.concurrentcounter;

public class IncrementingThread extends Thread {
	
	private AtomicCounter counter;
	
	public IncrementingThread(AtomicCounter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		counter.incrementAndGet();
	}
}
