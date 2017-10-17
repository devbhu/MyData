package ArrayQuestions;

public class CountAllDistinctPairsWithDifferenceEqualtoK {
	
	int countPairsWithDiffK(int arr[], int n, int k)
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
	        if (x - k >= 0 && hashmap[x - k]){
	            count++;
	            System.out.println(x+"  "+(x-k));
	        }
	        if (x + k < Integer.MAX_VALUE && hashmap[x + k]){
	            count++;
	            System.out.println(x+"  "+(x+k));
	        }
	        hashmap[x] = false;
	    }
		return count;
	}


    public static void main(String[] args) {
    	CountAllDistinctPairsWithDifferenceEqualtoK s=new CountAllDistinctPairsWithDifferenceEqualtoK();
    	int arr[] =  {1, 5, 3, 4, 2};
        int n = 5;
        int k = 4;
        System.out.print("the number of all distinct pairs having difference equal to "+k+ " are ");
    	System.out.println(s.countPairsWithDiffK(arr,n,k)+" pairs");
    }
       
    

}
