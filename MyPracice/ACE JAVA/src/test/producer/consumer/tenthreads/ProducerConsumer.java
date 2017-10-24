package test.producer.consumer.tenthreads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ProducerConsumer {
	
	private static final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
	private static final AtomicInteger val = new AtomicInteger();
	
	private ProducerConsumer() {
	}
	
	private static final class Singleton {
	private static final ProducerConsumer PC = new ProducerConsumer();	
	}
	
	public static final ProducerConsumer getInstance() {
		return Singleton.PC;
	}
	
	public void consume() {
		int va = 0;
		try {
			va = queue.take();
			System.out.println(Thread.currentThread().getName() +" : "+ va);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
    public void produce() {
		try {
			int value = val.incrementAndGet();
			System.out.println(Thread.currentThread().getName()+" : "+ value);
			queue.put(value);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
