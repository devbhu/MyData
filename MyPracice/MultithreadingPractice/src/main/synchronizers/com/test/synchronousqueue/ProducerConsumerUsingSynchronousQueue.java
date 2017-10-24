package com.test.synchronousqueue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.SynchronousQueue;

public class ProducerConsumerUsingSynchronousQueue {
	
	private final SynchronousQueue<Long> syncQueue  = new SynchronousQueue<Long>();
	
	
	public void produce(){
		try{
		Long i = 0L;
		while(i<100){
			System.out.println("pro"+ ++i);
		 syncQueue.put(i);
		
		}
		
		}catch(Exception ex){
			
			ex.printStackTrace();
		}
	}
	
	
	public void consume(){
		try{
			
		while(true){
	//	Long val = ;
		System.out.println("GET"+syncQueue.take());
		}
		
		}catch(Exception ex){
			
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		final ProducerConsumerUsingSynchronousQueue prodConsumer = new ProducerConsumerUsingSynchronousQueue();
		
		Thread producer = new Thread(){
			@Override
			public void run(){
				
				prodConsumer.produce();
			}
			
		};
		
		
		Thread consumer = new Thread(){
			@Override
			public void run(){
				
				prodConsumer.consume();
			}
			
		};
		
		producer.setName("RumiProducer");
		consumer.setName("ArindamConsumer");
		producer.start();
	    consumer.start();
		
		
	}
	

}
