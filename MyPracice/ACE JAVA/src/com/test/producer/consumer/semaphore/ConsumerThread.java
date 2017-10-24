package com.test.producer.consumer.semaphore;

public class ConsumerThread extends Thread{

    @Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			Resource.getInstance().consume(i);
		}
	}
}
