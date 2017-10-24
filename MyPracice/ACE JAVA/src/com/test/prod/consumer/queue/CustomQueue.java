package com.test.prod.consumer.queue;

public interface CustomQueue<E> {
	
	void put(E e);
	
    E take();
}
