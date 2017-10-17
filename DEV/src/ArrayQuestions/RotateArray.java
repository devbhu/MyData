package ArrayQuestions;

public class RotateArray
{
	
	private int[]  reverse(int arr[],int start,int end){
		while(start<end){
			int temp =arr[start];
			arr[start] =arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		return arr;
	}
 void print(int arr[]){
	 for(int i=0;i<arr.length;i++){
		 System.out.print(arr[i]+"  ,");
	 }
 }
	
	public static void main(String[] args)
	{    
		RotateArray ra=new RotateArray();
		int k=5;
		 int a[]={1,2,3,4,5,6,7,8};
		 int lastIndex = a.length-1;
		ra.print(a);
		 a=ra.reverse(a, 0, lastIndex);
		 a=ra.reverse(a, 0, lastIndex-k);
		 a=ra.reverse(a, lastIndex-k+1, lastIndex);
		 System.out.println();
		 ra.print(a);
		
		

	}

}
