package test.largest.unsorted;

public class Sorting {

	private static final Integer[] arr = new Integer[] { 1,8,5,7,1,6,9 };

	public static void main(String[] args) {
		findLargestAndSecLargest(arr);
	}

	private static void findLargestAndSecLargest(Integer[] arr2) {
		int fmax = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		for (Integer val : arr) {
			if (val > fmax) {
				smax = fmax;
				fmax = val;
			} else if (val > smax) {
				smax = val;
			}
		}

		System.out.println("First max : " + fmax + ", second max : " + smax);
	}

}
