package com.test.controlling.group.tasks;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer>{
	
	Integer var ;
	
	public Task(Integer var) {
		this.var=var;
	}

	@Override
	public Integer call() throws Exception {
		
		 var++;
		Thread.sleep(2000);
		return var;
	}

}
