package ArrayQuestions;

public class CountAllDistinctPairsWithAdditionEqualtoK {
	
	int countPairsWithSumK(int arr[], int n, int k)
	{
		int count = 0; // Initialize count

		// Initialize empty hashmap.
		boolean hashmap[] = new boolean[100];

		// Insert array elements to hashmap
		for (int i = 0; i < n; i++)
			hashmap[arr[i]] = true;
		
		for (int i = 0; i < n; i++)
	    {
	        int x = arr[i];
	        if(x*2==k)
	        	count--;
	        if (k-x >= 0 && hashmap[k-x]){
	            count++;
	           // System.out.println(x+"  "+(k-x));
	        }
	      //  if (x + k < Integer.MAX_VALUE && hashmap[x + k]){
	         //   count++;
	          //  System.out.println(x+"  "+(x+k));
	      //  }
	        hashmap[x] = false;
	    }
		return count;
	}


    public static void main(String[] args) {
    	CountAllDistinctPairsWithAdditionEqualtoK s=new CountAllDistinctPairsWithAdditionEqualtoK();
    	int arr[] =  {1, 5, 3, 4, 2};
        int n = 5;
        int k = 6;
    	System.out.print("the number of all distinct pairs having sum equal to "+k+ " are ");
    	System.out.println(s.countPairsWithSumK(arr,n,k)+" pairs");
    }
}
