package dynamicprogramming;

public class CoinNoOfWays {
	// non dynamic top down recurssive approach
	int count( int S[], int m, int n )
	{
	    // If n is 0 then there is 1 solution (do not include any coin)
	    if (n == 0)
	        return 1;
	     
	    // If n is less than 0 then no solution exists
	    if (n < 0)
	        return 0;
	 
	    // If there are no coins and n is greater than 0, then no solution exist
	    if (m <=0 && n >= 1)
	        return 0;
	 
	    // count is sum of solutions (i) including S[m-1] (ii) excluding S[m-1]
	    return count( S, m - 1, n ) + count( S, m, n-S[m-1] );
	}
	
	//Bottom up dynamic approach
	
	public int numberOfSolutions(int total, int coins[]){
        int temp[][] = new int[coins.length+1][total+1];
        for(int i=0; i <= coins.length; i++){
            temp[i][0] = 1;
        }
        for(int i=0; i <= coins.length; i++){
            temp[0][i] = 0;
        }
        for(int i=1; i <= coins.length; i++){
            for(int j=1; j <= total ; j++){
                if(coins[i-1] > j){
                    temp[i][j] = temp[i-1][j];
                   
                }
                else{
                    temp[i][j] = temp[i][j-coins[i-1]] + temp[i-1][j];
                }
              //  System.out.print(temp[i][j]+"  ");
            }
          //  System.out.println();
        }
        return temp[coins.length][total];
    }
	 
	/**
     * Space efficient DP solution
     */
    public int numberOfSolutionsOnSpace(int total, int arr[]){

        int temp[] = new int[total+1];

        temp[0] = 1;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j <= total ; j++){
                if(j >= arr[i]){
                    temp[j] += temp[j-arr[i]];
                }
            }
        }
        return temp[total];
    }
	
	public static void main(String[] args) {
			int total = 10;
	        int coins[] = {2, 5, 3, 6};
	        		int size = coins.length;
	        CoinNoOfWays cc = new CoinNoOfWays();
	        System.out.println(cc.count(coins,size,total));
	        System.out.println(cc.numberOfSolutions(10,coins));
	        System.out.println(cc.numberOfSolutionsOnSpace(10,coins));
	        

	}

}
