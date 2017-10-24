package com.test.list.arraylist;

import java.util.Arrays;

public class MyCustomArrayList {

	private static final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE-8;
	
	int size=0;
	
	Object array[];
	
	int capacity = 10;
	
	public MyCustomArrayList() {
		
		array = new Object[capacity];
		
		
	}
	
	public void add(Object obj){
		
		if(ensureCapacity()){
			
			array[size++] = obj;
			
		}
		
	}
	
	
	public void remove(int index){
		
		if(index > size-1 || index<0){
			
			throw new IllegalArgumentException("Invalid index");
			
		}
		
		int srcPos = index+1;
		
		int length = array.length;
		
		if(!(length==1 || index==length-1))
		
		System.arraycopy(array,srcPos , array, index,size-srcPos);
		
		array[--size] = null;
		
	}


	private boolean ensureCapacity() {
		
		boolean isCapacityRequired = false;
		
		if(size>=capacity && size<MAX_ARRAY_LENGTH){
			
			capacity = capacity + capacity>>1;
		
		    isCapacityRequired = !isCapacityRequired;
			
		} else if (size>MAX_ARRAY_LENGTH){
			
			capacity = Integer.MAX_VALUE;
			isCapacityRequired = !isCapacityRequired;
			
			
		} else if(size==MAX_ARRAY_LENGTH){
			
			capacity = MAX_ARRAY_LENGTH;
			isCapacityRequired = !isCapacityRequired;
		}
		if(isCapacityRequired){
		  
		  
		 array =  Arrays.copyOf(array, capacity);
		
		}
		
		return isCapacityRequired;
		
	}
	
	
}
