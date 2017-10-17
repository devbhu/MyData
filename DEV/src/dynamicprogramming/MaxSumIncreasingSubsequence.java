package dynamicprogramming;

public class MaxSumIncreasingSubsequence {

	/**
	 * @param args
	 */
	
	static int maxSum(int a[]){
		int maxValue=0;
		int l = a.length ;
		int b[]  = new int[l];
		int c[]  = new int[l];
		for(int i = 0 ; i < l; i++){
			b[i] = a[i];
		}
		for(int i = 0 ; i < l; i++){
			c[i] = i;
		}
		
		for(int i = 1 ; i < l; i++){
			for(int j = 0 ; j < i; j++){
			if(a[j]<a[i]){
				if(b[j]+a[i]>b[i])
				{
					b[i]= b[j]+a[i];
					//c[i]= j;
				}
			}
			}
			if(b[i]>maxValue)
				maxValue=b[i];
			
		}
		/*for(int i = 0 ; i < l; i++)
		{
			if(b[i]>maxValue)
				maxValue=b[i];
		}*/
		return maxValue;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1, 101, 2, 3, 100, 4, 5};
		System.out.println(MaxSumIncreasingSubsequence.maxSum(a));

	}

}
