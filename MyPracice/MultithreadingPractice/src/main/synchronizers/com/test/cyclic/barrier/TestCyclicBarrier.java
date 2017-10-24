package com.test.cyclic.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

interface Filter{
	
	int[] filter(int array[]);
	
}


class Task implements Runnable{
    
	Filter filter;
	
	int count;
	
	CyclicBarrier barrier;
	public Task(CyclicBarrier barrier,Filter filter) {

     this.filter=filter;
     this.barrier=barrier;
	}
	
	@Override
	public void run() {
		
		try {
			//count = filter.filter(null).length;
			Thread.sleep(1000);
			barrier.await();
			System.out.println("awating complete "+Thread.currentThread().getName());
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

}



public class TestCyclicBarrier {

	
  private final static int[]array = new int[10];
  
  {
	  
	  array[0]=-1;
	  array[1]=9;
	  array[2]=7;
	  array[3]=4;
	  array[4]=-90;
	  array[5]=45;
	  array[6]=-66;
	  array[7]=90;
	  array[8]=92;
	  array[9]=-667;
			  
	  
  }
  
  
  public static void main(String[] args) {
 	  
	 Runnable r = new Runnable() {
		
		@Override
		public void run() {
			
			
			System.out.println(Thread.currentThread().getName());
			
			//while(true){}
			
		}
	}; 
	
	CyclicBarrier barrier = new CyclicBarrier(1,r);
	 Task t1 = new Task(barrier,new Filter() {
			
			@Override
			public int[] filter(int[] array) {
			   int arr[] = new int[4];
			   int k=0;
			   for(int i=0;i<array.length;i++){
				   
			     if(array[i]<0){
			    	 
			       arr[k++]=array[i];
			     }
			   }
			   
				return arr;
		}
		 }); 
	 
	 
	Task t2 =  new Task(barrier,new Filter() {
			
			@Override
			public int[] filter(int[] array) {
			   int arr[] = new int[6];
			   int k=0;
			   for(int i=0;i<array.length;i++){
				   
			     if(array[i]>0){
			    	 
			       arr[k++]=array[i];
			     }
			   }
			   
				return arr;
		}
		 });
	   
	 ExecutorService service  = Executors.newFixedThreadPool(4); 
	 
	
		 
		 
		 service.submit(t1);
		 
		 
		 service.submit(t2);
		 service.submit(t2);
		 service.submit(t2);
		 
	 
	 
	 
	  
    }
	

}
