package com.test.custom.semaphore;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomSemaphore {

	private volatile int count;
	private volatile int countTracker;
	private final Lock lock = new ReentrantLock();
	private final Condition allowCond = lock.newCondition();

	public CustomSemaphore(int count) {
		this.count = count;
		this.countTracker = count;
	}

	public void acquire() {
		try {
			lock.lock();
			if (countTracker-- <= 0) {
				allowCond.await();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void release() {
		try {
			lock.lock();
			if (countTracker < count) {
				allowCond.signal();
				countTracker++;
			}
		}  finally {
			lock.unlock();
		}

	}

}
