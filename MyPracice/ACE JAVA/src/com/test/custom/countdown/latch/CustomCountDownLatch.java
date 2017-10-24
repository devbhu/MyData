package com.test.custom.countdown.latch;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomCountDownLatch {

	private final Lock lock = new ReentrantLock();
	private final Condition latchCond = lock.newCondition();
	private final AtomicInteger latchCount;

	public CustomCountDownLatch(int latchCount) {

		if (latchCount < 0) {

			throw new IllegalArgumentException();
		}

		this.latchCount = new AtomicInteger(latchCount);
	}

	public void await() throws InterruptedException {
		try {

			lock.lock();

			if (latchCount.get() > 0) {

				latchCond.await();

			}
		} finally {

			lock.unlock();
		}

	}

	public void countDown() {
		try {
			if (latchCount.get() >= 0) {

				lock.lock();

				latchCount.decrementAndGet();
				if (latchCount.get() == 0) {
					latchCond.signalAll();

				}
			}

		}

		finally {

			lock.unlock();

		}

	}

}
