package com.test.threadlocal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class UsingThreadLocal implements Runnable{
	
	ThreadLocal<SimpleDateFormat> local = new ThreadLocal<SimpleDateFormat>(){
		
		@Override
		protected SimpleDateFormat initialValue(){
			
			
			return new SimpleDateFormat();
			
		}
		
	};
	
	
	

	
	public static void main(String[] args) {
		
		UsingThreadLocal ut = new UsingThreadLocal();
		
		Thread t1 = new Thread(ut);
		Thread t2 = new Thread(ut);
		Thread t3 = new Thread(ut);
		
		System.out.println(t1);
		
		System.out.println(t2);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd"));
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}





	@Override
	public void run() {
		
		
		System.out.println(local.get().hashCode());
		
	}
}
