package test.countdown.latch;

import java.util.concurrent.CountDownLatch;

public class SecondBatchThread extends Thread {
	
	private CountDownLatch latch;

	public SecondBatchThread(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()
					+ " is waiting for the show");
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Theatre.getInstance().watchingShow();
	}

}
