package miscellaneous.questions;

public class MergeTwoSortedArrayInThiredSortedArray {
	public static int[] merge(int[] a, int[] b) {

		int[] answer = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				answer[k] = a[i];
				i++;
			} else {
				answer[k] = b[j];
				j++;
			}
			k++;
		}

		while (i < a.length) {
			answer[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			answer[k] = b[j];
			j++;
			k++;
		}

		return answer;
	}

	public static void main(String[] args) {
		int a[] = MergeTwoSortedArrayInThiredSortedArray.merge(new int[] { 1,
				6, 8, 10 }, new int[] { 0, 2, 5, 7 });
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		// TODO Auto-generated method stub

	}

}
