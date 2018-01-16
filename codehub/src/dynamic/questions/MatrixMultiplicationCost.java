package dynamic.questions;

public class MatrixMultiplicationCost {
  
	// Recurssive approach 
	
	int MatrixChainOrder(int p[], int i, int j)
	{
	    if(i == j)
	        return 0;
	    int k;
	    int min = Integer.MAX_VALUE;
	    int count;
	 
	 
	    for (k = i; k <j; k++)
	    {
	        count = MatrixChainOrder(p, i, k) +
	                MatrixChainOrder(p, k+1, j) +
	                p[i-1]*p[k]*p[j];
	 
	        if (count < min)
	            min = count;
	    }
	 
	
	    return min;
	}
	
	
	//Bottom up dynamic approach 
    public int findCost(int arr[]){
        int temp[][] = new int[arr.length][arr.length];
        int q = 0;
        for(int l=2; l < arr.length; l++){
            for(int i=0; i < arr.length - l ; i++){
                int j = i + l;
                temp[i][j] = Integer.MAX_VALUE;
                for(int k=i+1; k < j; k++){
                	//System.out.println(k+"  "+j);
                    q = temp[i][k] + temp[k][j] + arr[i]*arr[k]*arr[j];
                    if(q < temp[i][j]){
                        temp[i][j] = q;
                    }
                }
            }
        }
        for(int i=0 ; i< arr.length-1; i++){
        	for(int j=1 ; j< arr.length; j++){
        		System.out.print(temp[i][j]+"   ");
        	}
        	System.out.println();
        }
        return temp[0][arr.length-1];
    }
    
    public static void main(String args[]){
        MatrixMultiplicationCost mmc = new MatrixMultiplicationCost();
        int arr[] = {2,3,6,4,5};
        int cost = mmc.findCost(arr);
        int cost1 =mmc.MatrixChainOrder(arr,1,arr.length-1);
        System.out.println("minimum cost  "+cost);
        System.out.println("minimum cost  "+cost1);
    }
}