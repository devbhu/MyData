package com.test.fork.join;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class MyTask extends RecursiveTask<Integer>{

	
	int from;
	int to;
	
	public MyTask(int from, int to) {
		
		
		this.from=from;
		this.to=to;
		
	}

	@Override
	protected Integer compute() {
		
		if((to-from )<=5){
			
			return (to-from);
			
		}
		
		else{
			
			int mid = (to-from)/2;
			
			int from1 = 0;
			int to1 = mid-1;
			
			int from2 = mid;
			int to2 = to;
			
			MyTask t1 = new MyTask(from1, to1);
			MyTask t2 = new MyTask(from2, to2);
			
			//invokeAll(new ForkJoinTask[]{t1,t2});
			invokeAll(t1,t2);
			return t1.join()+t2.join();
		}
		
	}

}
