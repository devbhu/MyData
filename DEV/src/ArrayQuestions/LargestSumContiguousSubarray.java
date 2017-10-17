package ArrayQuestions;

public class LargestSumContiguousSubarray {

	static int maxSum(int a[]){
		int om,cm;
		om=cm=a[0];
		for(int i = 1 ; i< a.length ; i++){
			cm = Math.max(a[i],cm + a[i]);
			om = Math.max(cm,om);
		}
		return om;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { -3,2,1,8};
		 System.out.println(LargestSumContiguousSubarray.maxSum(arr));
	}

}
