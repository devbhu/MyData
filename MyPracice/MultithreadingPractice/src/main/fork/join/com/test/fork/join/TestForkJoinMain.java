package com.test.fork.join;

import java.util.concurrent.ForkJoinPool;

public class TestForkJoinMain {
	
	public static void main(String[] args) {
		
		double arr[]=new double[10];

		for(int i=0;i<10;i++){
		 
			arr[i]=0.9+1;
			
		}
		
		
		MyTask task = new MyTask(0,arr.length);
		
		ForkJoinPool pool = new ForkJoinPool(1);
		
		pool.invoke(task);
		
		System.out.println("dfdf");
		
		System.out.println("The count is :" +task.join());
		
		
	}

}
