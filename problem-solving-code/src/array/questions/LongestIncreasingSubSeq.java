package array.questions;

public class LongestIncreasingSubSeq {
    private int lengthOfLIS(int[] nums) {
        int l = nums.length;
        int a[] = new int[l];
        int n = 0;
        for (int i = 0; i < l; i++) {
            a[i] = 1;
        }
        for (int i = 1; i < l; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && a[i] <= a[j]) {
                    a[i] = 1 + a[j];
                }
            }
        }
        for (int i = 0; i < l; i++) {
            if (n < a[i]) {
                n = a[i];
            }
        }
        return n;
    }

    public static void main(String arg[]) {
        int a[] = {10, 9, 2, 5, 3, 7, 101, 18};
        LongestIncreasingSubSeq obj = new LongestIncreasingSubSeq();
        System.out.println(obj.lengthOfLIS(a));
    }
}
