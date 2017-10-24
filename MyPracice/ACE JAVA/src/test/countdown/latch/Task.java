package test.countdown.latch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class Task implements Callable {

	private CountDownLatch latch;

	public Task(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName()
				+ " is exiting the theatre");
		latch.countDown();
		return null;
	}

}
