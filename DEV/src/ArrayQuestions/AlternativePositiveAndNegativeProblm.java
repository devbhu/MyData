package ArrayQuestions;

public class AlternativePositiveAndNegativeProblm {

	static void FindModifiedArray(int arr[], int size) {
		int i, temp, j;
		i = temp = 0;
		for (i = 0; i < size; i++) {
			if (i % 2 == 0 && arr[i] < 0 || i % 2 != 0 && arr[i] > 0)
				continue;
			else if (i % 2 == 0 && arr[i] > 0) {
				for (j = i; j < size; j++) {
					if (arr[j] < 0) {
						shiftArray(arr, arr[j], i, j);
						break;

					}

				}

			} else if (i % 2 != 0 && arr[i] < 0) {
				for (j = i; j < size; j++) {
					if (arr[j] > 0) {
						shiftArray(arr, arr[j], i, j);
						break;
					}

				}

			}

		}

	}

	static void shiftArray(int arr[], int temp, int i, int j) {
		while (j > i) {

			arr[j] = arr[j - 1];

			j--;

			System.out.println(j);
		}
		arr[i] = temp;
	}

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
