package com.test.producer.consumer.semaphore;

import java.util.ArrayList;
import java.util.List;

import com.test.custom.semaphore.CustomSemaphore;

public class Resource {
	private static final List<Integer> BUFFER = new ArrayList<>();
	private static final int MAX_BUFFER_SIZE = 10;
	private volatile static Resource res = null;
	private final CustomSemaphore resourceManager = new CustomSemaphore(MAX_BUFFER_SIZE);

	private Resource() {
	}

	public static Resource getInstance() {
		if (res == null) {
			synchronized (Resource.class) {
				if (res == null) {
					res = new Resource();
				}
			}
		}
		return res;
	}

	public void produce(int val) {
		resourceManager.acquire();
		synchronized (BUFFER) {
			boolean isAdded = BUFFER.add(val);
			if (isAdded)
				System.out.println(Thread.currentThread().getName()
						+ " produces " + val);
			BUFFER.notify();
		}
		resourceManager.release();
	}

	public void consume(Integer val) {
		resourceManager.acquire();
		synchronized (BUFFER) {
			boolean isRemoved = BUFFER.remove(val);
			while(!isRemoved){
				try {
					BUFFER.wait();
					isRemoved = BUFFER.remove(val);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if (isRemoved)
				System.out.println(Thread.currentThread().getName()+" consumes : "+val);
			
		}
		resourceManager.release();
	}

}
