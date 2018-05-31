package dynamic.questions;

public class LongestBiotanicSubSequence {

	// Bottom up dynamic approach

	static int lis(int arr[],int n)
	{
		int lis[] = new int[n];
		int temp[] = new int[n];
		int i,j,max = 0;

		/* Initialize LIS values for all indexes */
		for ( i = 0; i < n; i++ ){
			lis[i] = 1;
			temp[i]=1;
		}

		/* Compute optimized LIS values in bottom up manner */
		for ( i = 1; i < n; i++ ){
			for ( j = 0; j < i; j++ )
				if ( arr[i] > arr[j])
					lis[i] = Math.max(lis[i],lis[j] + 1);
		}

		for ( i = n-2; i > 0; i-- ){
			for ( j = n-1; j > i; j-- )
				if ( arr[i] > arr[j])
					temp[i] = Math.max(temp[i],temp[j] + 1);
		}


		for ( i = 0 ; i < n; i++ )
			lis[i] = lis[i] + temp[i] -1;

		/* Pick maximum of all LIS values */
		for ( i = 0; i < n; i++ )
			if ( max < lis[i] )
				max = lis[i];

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 11, 2, 10, 4, 5, 2, 1};
		int n = arr.length;
		System.out.println("Length of Bitonic subsequence is " + lis( arr, n ) );
	}

}
