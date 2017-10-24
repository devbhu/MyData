package test.countdown.latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	private static final Integer duration = 30;
	private static final Integer theatreCapacity = 5;
	private static final CountDownLatch latch = new CountDownLatch(5);

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		SecondBatchThread t1 = new SecondBatchThread(latch);
		t1.setName("SecondBatchThread1");
		SecondBatchThread t2 = new SecondBatchThread(latch);
		t2.setName("SecondBatchThread2");
		SecondBatchThread t3 = new SecondBatchThread(latch);
		t3.setName("SecondBatchThread3");
		SecondBatchThread t4 = new SecondBatchThread(latch);
		t4.setName("SecondBatchThread4");
		SecondBatchThread t5 = new SecondBatchThread(latch);
		t5.setName("SecondBatchThread5");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		ScheduledExecutorService executorService = Executors
				.newScheduledThreadPool(theatreCapacity);
		executorService.schedule(new Task(latch), duration, TimeUnit.SECONDS);
		executorService.schedule(new Task(latch), duration, TimeUnit.SECONDS);
		executorService.schedule(new Task(latch), duration, TimeUnit.SECONDS);
		executorService.schedule(new Task(latch), duration, TimeUnit.SECONDS);
		executorService.schedule(new Task(latch), duration, TimeUnit.SECONDS);

		executorService.shutdown();

	}

}
