package dynamicprogramming;

public class RodCutting {
	// dydnamic bottom up  approach memory efficient 
	static int cutRod(int price[], int n)
	{
	   int val[] = new int [n+1];
	   val[0] = 0;
	   int i, j;
	 
	   
	   for (i = 1; i<=n; i++)
	   {
	       int max_val = Integer.MIN_VALUE;
	       for (j = 0; j < i; j++)
	         max_val = Math.max(max_val, price[j] + val[i-j-1]);
	       val[i] = max_val;
	   }
	 
	   return val[n];
	}
	
	// dydnamic bottom up  approach 
	
	static int cutRod1(int price[], int n){
		int val[][] = new int [n+1][n+1];
		for(int i=0 ; i <= n ; i++)
			val[0][i]=0;
		for(int i=0 ; i <= n ; i++)
			val[i][0]=0;
		for(int i=1 ; i <= n ; i++)
			val[1][i]=i*price[0];
		for(int i=2 ; i <= n ; i++){
			for(int j=1 ; j <= n ; j++){
				
				 if(i>j)
					val[i][j] = val[i-1][j];
				else 
					val[i][j] = Math.max(val[i-1][j],val[i][j-i]+ price[i-1]);
			}
		}
		
		for(int i=0 ; i <= n ; i++){
			for(int j=0 ; j <= n ; j++){
				 System.out.print(val[i][j]+"  ");
			}
			 System.out.println();
		}
		return val[n][n];
		
	}
	// non dynamic 
	public static int recursiveMaxValue(int price[],int len){
        if(len <= 0){
            return 0;
        }
        int maxValue = 0;
        for(int i=0; i < len;i++){
            int val = price[i] + recursiveMaxValue(price, len-i-1);
            if(maxValue < val){
                maxValue = val;
            }
        }
        return maxValue;
    }
	
	public static void main(String[] args) {
		int arr[] = {2,5,7,8};
	    int size = arr.length;
	    System.out.println("Maximum Obtainable Value is "+ RodCutting.cutRod(arr, size));
	    System.out.println("Maximum Obtainable Value is "+ RodCutting.cutRod1(arr, size));
	    System.out.println("Maximum Obtainable Value is "+ RodCutting.recursiveMaxValue(arr, size));
	}

}
