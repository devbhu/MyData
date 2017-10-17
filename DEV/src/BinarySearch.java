public class BinarySearch
{
	static int binarySearch(int a[], int l, int h, int n)
	{
		if (l < h)
		{
			int mid = (l + h) / 2;
			if (a[mid] > n)
				return binarySearch(a, l, mid, n);
			else if (a[mid] < n)
				return binarySearch(a, mid + 1, h, n);
			else
				return mid;

		} else
			return -1;
	}

	// non recursive
	static int binarySearch1(int a[], int low, int high, int n)
	{
		int l = low;
		int h = high;
		while (l < h)
		{
			int mid = (l + h) / 2;
			if (a[mid] > n)
			{
				h = mid;
			} else if (a[mid] < n)
			{
				l = mid + 1;

			}

			else
				return mid;

		}
		return -1;
	}

	public static void main(String[] args)
	{
		int a[] =
		{ 1, 4, 6, 7, 9, 23, 45, 67, 89 };
		int n = 1;
		if (binarySearch(a, 0, a.length, n) >= 0)
		{
			System.out.println("Nouber is found at index  :"
					+ binarySearch(a, 0, a.length, n));

		} else
			System.out.println("number is not found ");
		if (binarySearch1(a, 0, a.length, n) >= 0)
		{
			System.out.println("Nouber is found at index1  :"
					+ binarySearch1(a, 0, a.length, n));

		} else
			System.out.println("number is not found 1");

	}

}
