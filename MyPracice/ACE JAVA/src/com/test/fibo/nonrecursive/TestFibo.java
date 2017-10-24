package com.test.fibo.nonrecursive;

import java.util.Arrays;

public class TestFibo {
	
	  public static void main(String[] args) {
			
			System.out.println("Printing fibponacci recursive!!!");
			int fib[] = new int[9];
			
			for(int i=0;i<8;i++)
			System.out.print(new FibonacciSeries().printFiboRecursive(i,fib)+" ");
			
			System.out.println();
			System.out.println("Printing fibonacci iteratively");
			
			System.out.println(Arrays.toString(new FibonacciSeries().printFiboNonRecursive(8)));
			
			 
	}

}
