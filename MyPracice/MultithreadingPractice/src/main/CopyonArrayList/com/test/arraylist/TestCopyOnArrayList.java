package com.test.arraylist;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;


public class TestCopyOnArrayList implements Runnable{
	
	private static final CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
	
	public static void main(String[] args) {
		TestCopyOnArrayList test = new TestCopyOnArrayList();
		
		Thread t1 = new Thread(test);
		
		t1.start();
		Scanner scan  = new Scanner(System.in);
		while(true){
			int value = scan.nextInt();
			list.add(value);
		}
		
		
	}

	@Override
	public void run() {
		Iterator t = list.iterator();
		int size = list.size();
		while(true){
			if(size!=list.size()){
			System.out.println("The list size is --->"+list.size());
			size = list.size();
			}
			
		}
		/*
		while(true){
			if(t.hasNext())
			System.out.println("The value is : "+t.next());
		}*/
		
	}

}
