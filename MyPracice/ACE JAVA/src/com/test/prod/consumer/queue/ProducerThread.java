package com.test.prod.consumer.queue;

public class ProducerThread extends Thread {
	
    final CustomQueue<Integer> queue;
    int val;
	    
    public ProducerThread(CustomQueue<Integer> queue,int val) {
		super();
		this.queue = queue;
		this.val = val;
	}

    @Override
	public void run() {
		//for(int i = 0; i < 20; i++) {
			queue.put(val);
		//}
	}
}
