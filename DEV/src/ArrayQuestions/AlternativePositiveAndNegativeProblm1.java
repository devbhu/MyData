package ArrayQuestions;

public class AlternativePositiveAndNegativeProblm1 {

	static void FindModifiedArray(int arr[], int size) {
		int i, temp, j;
		i = temp = 0;
		for (i = 0; i < size; i++) {
			temp = i;
			if (i % 2 == 0 && arr[i] < 0 || i % 2 != 0 && arr[i] > 0)
				continue;
			 if (i % 2 == 0 && arr[i] > 0) {
				// for (j = i; j < size; j++) {
				
					rvereseArray(arr, 0, i - 1);
					rvereseArray(arr, i, i);
					rvereseArray(arr, 0, i);

				

			} else if (i % 2 != 0 && arr[i] < 0) {

				
					rvereseArray(arr, 0, i - 1);
					rvereseArray(arr, i, i);
					rvereseArray(arr, 0, i);
				

			}

		}

	}

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

	/*
	 * static void shiftArray(int arr[], int temp, int i, int j) { while (j > i)
	 * {
	 * 
	 * arr[j] = arr[j - 1];
	 * 
	 * j--;
	 * 
	 * System.out.println(j); } arr[i] = temp; }
	 */

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, -4, 5, 7, -9 };
		FindModifiedArray(arr, arr.length);
		printArray(arr);
	}

}
