package array.questions;

public class BooleanMatrixUniqueRows
{
	// Iterative method O(row*row*col)
	static void findUniqueRows(int a[][], int m, int n)
	{
		int count = 0;
		System.out.println("Unique rows are ");
		for (int i = 0; i < n; i++)
			System.out.print(a[0][i] + "   ");
		System.out.println();

		for (int i = 1; i < m; i++)
			for (int j = 0; j < i; j++)
			{
				count = 0;
				for (int k = 0; k < n; k++)
					if (a[j][k] == a[i][k])
						count++;
				if (count == n)
					break;
				else if (i == j + 1)
				{
					for (int k = 0; k < n; k++)
						System.out.print(a[i][k] + "   ");
					System.out.println();
				}

			}

	}

	// using Trie Data Structure

	public static void main(String[] args)
	{
		int M[][] =
		{
		{ 0, 1, 0, 0, 1 },
		{ 1, 0, 1, 1, 0 },
		{ 0, 1, 0, 0, 1 },
		{ 1, 0, 1, 0, 0 } };

		BooleanMatrixUniqueRows.findUniqueRows(M, 4, 5);

	}

}
