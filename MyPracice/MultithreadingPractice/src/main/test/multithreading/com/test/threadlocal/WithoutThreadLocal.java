package com.test.threadlocal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


class ThreadWithSimpleDate implements Runnable{
	
	DateFormat df ; 
	
	public ThreadWithSimpleDate(DateFormat df) {
		this.df = df;
	}

	@Override
	public void run() {
		
		System.out.println(df.format(new Date()));
		
		
	}
	
	
	
	
}

public class WithoutThreadLocal {

	private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void main(String[] args) {
		ThreadWithSimpleDate date1 = new ThreadWithSimpleDate(df);
		for(int i=1;i<=10000;i++){
		
		Thread t = new Thread(date1);
		t.start();
		}
	}
	
	
}
