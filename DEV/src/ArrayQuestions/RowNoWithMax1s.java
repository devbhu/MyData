package ArrayQuestions;

public class RowNoWithMax1s
{

	// binary search
	private int firstOccurenceOfOne(int a[], int low, int high)
	{
		int mid = 0;
		while (low < high)
		{
			mid = (low + high) / 2;
			if (mid == 0 || (a[mid] == 1 && a[mid - 1] == 0))
				return mid;
			if (a[mid] == 1 && a[mid - 1] == 1)
				high = mid;
			if (a[mid] == 0 && a[mid - 1] == 0)
				low = mid + 1;
		}
		return -1;
	}

	private int rowNoHavingMax1s(int a[][], int row, int col)
	{
		int rowNo = 0;
		int j = 1;

		int fist1sIndex = firstOccurenceOfOne(a[0], 0, col);
		System.out.println(fist1sIndex + " " + j);

		// to find row that atleast has one 1
		while (fist1sIndex == -1 && j < row)
		{
			fist1sIndex = firstOccurenceOfOne(a[j], 0, col);
			j++;
			System.out.println(fist1sIndex + " " + j);

		}

		// if matrix has only 0 's
		if (fist1sIndex == -1 && j == row)
			return -1;

		for (int i = 1; i < row; i++)

		{

			while (fist1sIndex >= 0 && a[i][fist1sIndex] == 1)
			{
				fist1sIndex--;
				rowNo = i;
			}

		}

		return rowNo;

	}

	public static void main(String[] args)
	{
		RowNoWithMax1s obj = new RowNoWithMax1s();
		int a[][] =
		{
		{ 1, 1, 1, 1, 1 },
		{ 1, 1, 1, 1, 1 },
		{ 1, 1, 1, 1, 1 },
		{ 1, 1, 1, 1, 1 } };

		int res = +obj.rowNoHavingMax1s(a, 4, 5);
		if (res > 0)
			System.out.println("Row number contaning max 1's is :"
					+ obj.rowNoHavingMax1s(a, 4, 5));
		else
			System.out.println("sorry no such row");
	}

}
