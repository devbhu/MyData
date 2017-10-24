package com.test.custom.concurrentcounter;

import java.util.concurrent.Semaphore;

public class MainTest {
	
	public static void main(String[] args) throws InterruptedException {
		AtomicCounter counter = new AtomicCounter();
		for (int i = 0; i < 20; i++) {
			IncrementingThread increThread = new IncrementingThread(counter);
			DecrementingThread decreThread = new DecrementingThread(counter);
			increThread.start();
			decreThread.start();
		}
	}

}
