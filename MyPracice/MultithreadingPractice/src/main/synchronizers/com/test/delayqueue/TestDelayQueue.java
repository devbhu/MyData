package com.test.delayqueue;

import java.util.concurrent.DelayQueue;


public class TestDelayQueue {

	public static void main(String[] args) {
		
		final DelayQueue<ItemDelay> itemDelay = new DelayQueue<ItemDelay>();
		
		for (int i = 0; i < 10; i++) {
			itemDelay.put(new ItemDelay("Rumi" + " " + i));
		}
		
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				int i = 0;
				while (i++ < 1) {
					try {
						System.out.println("Consume " + itemDelay.take());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				int i = 0;
				while (i++ < 1) {
					try {
						System.out.println(Thread.currentThread().getName()+ "Consume " + itemDelay.take());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
	}

}
