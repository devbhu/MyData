package dynamic.questions;

import java.util.Scanner;

public class StairCase {

	static int NumberOfWays(int n){
		int a[] = new int[n+1];
		a[0]=1;
		a[1]=1;
		for(int i =2 ; i<n; i++){
			a[i]= a[i-1] + a[i-2];
		}
		return a[n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(StairCase.NumberOfWays(n+1));
	}

}
