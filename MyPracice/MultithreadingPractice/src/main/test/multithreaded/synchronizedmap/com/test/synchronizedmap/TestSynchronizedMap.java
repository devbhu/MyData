package com.test.synchronizedmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestSynchronizedMap implements Runnable{
	
	
	final static Map map = Collections.synchronizedMap(new HashMap());
	
	static{
		
		map.put("1", 1234);
		map.put("2", 12345);
		map.put("3", 12346);
		map.put("4", 12347);
		
	}
	
	@Override
	public void run(){
		for(Object s : map.keySet()){
			
			System.out.println((String)s);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		TestSynchronizedMap test = new TestSynchronizedMap();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		Thread t3 = new Thread(test);
		
		t1.start();
		t2.start();
		
		
	}

}
