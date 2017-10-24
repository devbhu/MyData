package com.test.prod.consumer.queue;

public class ConsumerThread extends Thread{
	final CustomQueue<Integer> queue;
	
	
    public ConsumerThread(CustomQueue<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		//for(int i = 0; i < 20; i++) {
			System.out.println("Consume : "+queue.take());
		//}
	}
}
