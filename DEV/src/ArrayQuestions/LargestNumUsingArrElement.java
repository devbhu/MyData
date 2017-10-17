package ArrayQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNumUsingArrElement
{ 
	private static Integer method(ArrayList<Integer> al){
		int leftMost = 0;
		Integer val=0;
		int r=0;
		for(int i =0 ; i<al.size() ; i++){
			int n= al.get(i);
			while (n>0){
				r=n%10;
				n=n/10;
			}
			if(leftMost<r){
				leftMost=r;
				val = al.get(i);
			}
			else if(leftMost==r && val<al.get(i)){
				leftMost=r;
				val = al.get(i);
			}
				
		}
		return val;
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(34);
		al.add(3);
		al.add(98);
		al.add(9);
		al.add(76);
		al.add(45);
		al.add(4);
		String largestNumber = "";
		while(al.size()!=0){
			largestNumber+=method(al);
			al.remove(method(al));
		}
		//Integer t= method(al);
		System.out.println(largestNumber);
		/*al.remove(t);
		Collections.sort(al);
		for(int i= 0 ; i < al.size() ;i++){
			System.out.println(al.get(i));
			
		}
		for(Integer i : al){
			//System.out.println(i);
		}*/

	}

}
