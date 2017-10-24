package com.test.prod.consumer.queue;

public class MainTest {

	public static void main(String[] args) throws InterruptedException {
        
		final CustomQueue<Integer> queue=new CustomBlockingQueue<>(5);
		for(int i=0;i<20;i++){
		ConsumerThread ct = new ConsumerThread(queue);
		ct.setName("Consumer Thread");
		ct.setPriority(6);
		ct.start();
		}
		for(int i=0;i<20;i++){
		ProducerThread pt = new ProducerThread(queue,i);
		pt.setName("ProducerThread");
		pt.setPriority(1);
		pt.start();
		}
	}

}
