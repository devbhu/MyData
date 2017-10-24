package com.test.fibo.nonrecursive;

public class FibonacciSeries {

	public int[] printFiboNonRecursive(int maxValue) {
		int fib[] = new int[maxValue + 1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < maxValue + 1; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib;
	}

	public int printFiboRecursive(int n,int fib[]) {
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		if (fib[n] != 0) {
			return fib[n];
		} else {
			fib[n] = printFiboRecursive(n - 1,fib) + printFiboRecursive(n - 2,fib);
			return fib[n];
		}
	}

}
