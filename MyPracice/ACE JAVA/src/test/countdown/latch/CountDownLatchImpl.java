package test.countdown.latch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchImpl {

	private static final CountDownLatch latch = new CountDownLatch(3);

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				try {
					latch.await();
					System.out.println("Thread1 exit");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.start();

		Thread t2 = new Thread() {
			@Override
			public void run() {
				try {
					latch.await();
					System.out.println("Thread2 exit");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t2.start();

		Thread t3 = new Thread() {
			@Override
			public void run() {
				try {
					latch.await();
					System.out.println("Thread3 exit");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t3.start();

		Thread t4 = new Thread() {
			@Override
			public void run() {
				try {
					latch.await();
					System.out.println("Thread4 exit");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t4.start();

		Thread t5 = new Thread() {
			@Override
			public void run() {
				try {
					latch.await();
					System.out.println("Thread5 exit");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t5.start();

		Thread t6 = new Thread() {
			@Override
			public void run() {

				latch.countDown();
				// System.out.println("Thread6 exit");

			}
		};
		t6.start();

		Thread t7 = new Thread() {
			@Override
			public void run() {

				latch.countDown();
				// System.out.println("Thread7 exit");

			}
		};
		t7.start();

		Thread t8 = new Thread() {
			@Override
			public void run() {

				latch.countDown();
				// System.out.println("Thread8 exit");

			}
		};
		t8.start();

	}

}
