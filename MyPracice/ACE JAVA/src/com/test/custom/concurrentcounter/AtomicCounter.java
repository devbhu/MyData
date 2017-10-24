package com.test.custom.concurrentcounter;

public class AtomicCounter {

	private volatile int counter = 0;
	private final CustomLock lock = new ReentrantCustomLock();

	public int incrementAndGet() {
		try {
			lock.lock();
			
			System.out.println(Thread.currentThread().getName()
					+ " incrementing " + ++counter);
		} finally {

			lock.unlock();

		}
		return counter;
	}

	public int decrementAndGet() {
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()
					+ " decrementing " + --counter);

		} finally {

			lock.unlock();

		}
		return counter;
	}

}
