package temp;

public class shailaja {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int j = 4;
		int i = 0;
		int t = arr[4];
		while (j > i) {
			// t=arr[j];
			arr[j] = arr[j - 1];
			// arr[j-1]=t;

			j--;

		}
		arr[i] = t;
		for (i = 0; i < 5; i++)
			System.out.println(arr[i] + " ");
	}

}
