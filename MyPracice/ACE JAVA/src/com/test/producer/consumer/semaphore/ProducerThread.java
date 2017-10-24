package com.test.producer.consumer.semaphore;

public class ProducerThread extends Thread {

    @Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			Resource.getInstance().produce(i);
		}
	}
}
