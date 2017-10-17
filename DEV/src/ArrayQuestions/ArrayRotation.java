package ArrayQuestions;

public class ArrayRotation {

	/**
	 * @param args
	 */
	/* Function to left rotate arr[] of size n by d */
	static void leftRotate(int arr[], int d) {
		int n = arr.length;
		rvereseArray(arr, 0, d - 1);
		rvereseArray(arr, d, n - 1);
		rvereseArray(arr, 0, n - 1);
	}

	/* Function to reverse arr[] from index start to end */
	static void rvereseArray(int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	static int gcd(int a, int b) 
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
	static void Rotate(int arr[], int d, int n) 
    {
        int i, j, k, temp;
        for (i = 0; i < gcd(d, n); i++) 
        {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (1 != 0) 
            {
                k = j + d;
                if (k >= n) 
                    k = k - n;
                if (k == i) 
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

	/* UTILITY FUNCTIONS */
	/* function to print an array */
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		//leftRotate(arr, 2); // Rotate array by 2
		printArray(arr);
		Rotate(arr,2,7);
		for(int i=0 ; i<7;i++)
			System.out.print(arr[i]+",");
		
	}

}
