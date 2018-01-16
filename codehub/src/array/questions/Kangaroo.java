package array.questions;

import java.util.Scanner;

public class Kangaroo
{

	/**
	 * @param args
	 */
	public static String function(int x1 , int v1, int x2 ,int v2 ){
		boolean flag=false;
        long x=x1;
        long y=x2;
		if(x1<x2  && v2<v1){
			System.out.println("1");
			for(int i=0 ; i<Integer.MAX_VALUE;i++){
				x=x+v1;
				y=y+v2;
				if(x==y){
					flag=true;
					break;
				}
			}
		}
		else if(x1>x2  && v2>v1){
			System.out.println("2");
			for(int i=0 ; i<Integer.MAX_VALUE;i++){
				x=x+v1;
				y=y+v2;
				if(x==y){
					flag=true;
					break;
				}
			}
		}
		else if(x==y  && v2==v1)
			flag=true;
		if(flag)
			return"YES";
		else
			return "No";
		
	}
	
	public static void main(String[] args)
	{
		 Scanner in = new Scanner(System.in);
	        int x1 = in.nextInt();
	        int v1 = in.nextInt();
	        int x2 = in.nextInt();
	        int v2 = in.nextInt();
	        String result = function(x1, v1, x2, v2);
	        System.out.println(result);

	}

}
