package com.test.reentrant.lock;


class Resource1{
	
	private volatile int h = 0;
	
	volatile int[]array = new int[90];
	{
		
		array[0] = h;
		
	}	
	public Resource1() {
		h=90;
	}
	
public  void doWork1(){
		
		
		System.out.println("work 1 ");
		//while(true){}
	}
	
	
	public   void doWork2(){
		
		System.out.println("Work 2");
		//while(true){}
	}
	
}

class Resource{
	volatile int g = 0;
	
	public void testWorks(Resource1 r1){
		final int k=0;
		synchronized(r1){
			
			r1.doWork1();
			
			r1.doWork2();
			
			while(true){}
			
			
		}
		
		//System.out.println(Thread.currentThread().getName());
		
	}
	
	
	
public   void doWork3(){
		
		
		System.out.println(Thread.currentThread().getName()+" is running !!!");
		while(true){}
	}

public static synchronized void doWork4(){
	
	
	System.out.println(Thread.currentThread().getName()+" is running !!!");
	while(true){}
}
}

public class ProvingLockisOnObect {
	
	public static void main(String[] args) throws InterruptedException {
		
	final	Resource r = new Resource();
	final Resource1 r1 = new Resource1();
		
		Thread t1 = new Thread(){
			
			@Override
			public void run(){
				
		       r.testWorks(r1);		
				
			}
		};
		
Thread t2 = new Thread(){
			
			@Override
			public void run(){
				
		       r.testWorks(r1);		
				
			}
		};
		
Thread t3 = new Thread(){
			
			@Override
			public void run(){
				
		      	r.doWork3();
				
			}
		};
		
		

		
		t1.setName("F1 thread");
		t2.setName("F2 thread");
		t3.setName("F3 thread");
		
		t1.start();
		t2.start();
	//	t3.start();
		
		Thread.currentThread().sleep(600);
		
		System.out.println(t2.getState().name());
		
		System.out.println(t1.getState().name());

		
	}

}
