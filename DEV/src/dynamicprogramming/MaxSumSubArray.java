package dynamicprogramming;

public class MaxSumSubArray {

	static int Maximum_Sum_Subarray1(int arr[],int n)		//Overall Time Complexity O(n^3)
	{
		int ans = Integer.MIN_VALUE;							// #include<climits>
		for(int sub_array_size = 1;sub_array_size <= n; ++sub_array_size)		//O(n)
		{
			for(int start_index = 0;start_index < n; ++start_index)				//O(n)
			{
				if(start_index+sub_array_size > n)	//Subarray exceeds array bounds
					break;
				int sum = 0;
				for(int i = start_index; i < (start_index+sub_array_size); i++)	//O(n)
					sum+= arr[i];
				ans = Math.max(ans,sum);
			}
		}
		return ans;
	}
	
	static int Maximum_Sum_Subarray2(int arr[],int n)	//Overall Time Complexity O(n^2)
	{
		int ans = Integer.MIN_VALUE;
		for(int start_index = 0;start_index < n; ++start_index)					//O(n)		
		{
			int sum = 0;
			for(int sub_array_size = 1;sub_array_size <= n; ++sub_array_size)	//O(n)	
			{
				if(start_index+sub_array_size > n)	//Subarray exceeds array bounds
					break;
				sum+= arr[start_index + sub_array_size - 1];	//Last element of the new Subarray
				ans = Math.max(ans,sum);
			}
		}
		return ans;
	}
	
	// Devide and Conqure nlogn coplexity
	
	static int Maximum_Sum_Subarray3(int arr[],int n)	
	{
		if(n==1)
		{
			return arr[0];
		}
		int m = n/2;
		int left_MSS = Maximum_Sum_Subarray3(arr,m);
		int right_MSS = Maximum_Sum_Subarray3(arr,n-m);
		int leftsum = Integer.MIN_VALUE, rightsum = Integer.MIN_VALUE, sum=0;
		for(int i=m;i < n; i++)
		{
			sum += arr[i];
			rightsum = Math.max(rightsum,sum);
		}
		sum = 0;
		for(int i= (m-1);i >= 0; i--)
		{
			sum += arr[i];
			leftsum = Math.max(leftsum,sum);
		}
		int ans = Math.max(left_MSS,right_MSS);
		return Math.max(ans,leftsum+rightsum);
	}
	
	static int Maximum_Sum_Subarray4(int arr[],int n)	//Overall Time Complexity O(n)
	{
		int ans = arr[0],sum = 0;
		for(int i = 1;i < n; ++i)	//Check if all are negative
			ans = Math.max(ans,arr[i]);	
		if(ans<0)					//if Max < 0 return Max
			return ans;
		ans = 0;
		for(int i = 0 ;i < n; ++i)
		{
			if(sum + arr[i] > 0)
				sum+=arr[i];
			else
				sum  = 0;
			ans = Math.max(ans,sum);	
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,-2,5,-1};
		System.out.println(MaxSumSubArray.Maximum_Sum_Subarray1(arr,4));
		System.out.println(MaxSumSubArray.Maximum_Sum_Subarray2(arr,4));
		System.out.println(MaxSumSubArray.Maximum_Sum_Subarray3(arr,4));
		System.out.println(MaxSumSubArray.Maximum_Sum_Subarray4(arr,4));
	}

}
