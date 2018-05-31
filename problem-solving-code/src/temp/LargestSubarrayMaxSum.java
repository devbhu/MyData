package temp;

public class LargestSubarrayMaxSum {
	public static void findLargestSubarray(int[] array) {
        int curSum = 0, curStart = -1;
        int maxSum = 0, maxStart = -1, maxEnd = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (curStart < 0) {
                    // We only came to next sequence of positive numbers, lets' store the start idx (inclusive)
                    curStart = i;
                }
                curSum += array[i];
                if (curSum > maxSum) {
                    // update max indices
                    maxSum = curSum;
                    maxStart = curStart;
                }
            } else {
                if (curStart >= 0 && maxStart == curStart) {
                    // we just left the maximum sequence, let's remember ending index (exclusive)
                    maxEnd = i;

                }
                // reset fields
                curSum = 0;
                curStart = -1;
            }
        }
        // Special case for last element (don't forget about tail!)
        if (array[array.length - 1] > 0 && curStart >= 0 && maxStart == curStart) {
            maxEnd = array.length;
        }
        if (maxStart < 0) {
        	System.out.println("sorry no such array is there ");
        }
        for(int i=maxStart;i<maxEnd;i++){
        	System.out.print(array[i]+" ,");
        }
    }

    public static void main(String[] args) {
    	LargestSubarrayMaxSum obj=new LargestSubarrayMaxSum();
    	findLargestSubarray(new int[]{1,2,-5,7,2,5});
    	
    	
    }

}
