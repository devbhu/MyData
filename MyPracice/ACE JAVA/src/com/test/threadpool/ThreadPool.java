package com.test.threadpool;

public interface ThreadPool {
	
	public void execute(Runnable task);
	public void shutDown();

}
