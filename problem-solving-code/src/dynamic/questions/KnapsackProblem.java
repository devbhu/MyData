package dynamic.questions;

import java.util.HashMap;
import java.util.Map;

class KnapsackProblem
{

	// Non dynamic top down

	// Returns the maximum value that can be put in a knapsack of capacity W
	static int knapSackTopdown(int W, int wt[], int val[], int n)
	{
		// Base Case
		if (n == 0 || W == 0)
			return 0;

		// If weight of the nth item is more than Knapsack capacity W, then
		// this item cannot be included in the optimal solution
		if (wt[n - 1] > W)
			return knapSack(W, wt, val, n - 1);

		// Return the maximum of two cases:
		// (1) nth item included
		// (2) not included
		else
			return max(
					val[n - 1] + knapSackTopdown(W - wt[n - 1], wt, val, n - 1),
					knapSackTopdown(W, wt, val, n - 1));
	}

	class Index
	{
		int remainingWeight;
		int remainingItems;

		@Override
		public boolean equals(Object o)
		{
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;

			Index index = (Index) o;

			if (remainingWeight != index.remainingWeight)
				return false;
			return remainingItems == index.remainingItems;

		}

		@Override
		public int hashCode()
		{
			int result = remainingWeight;
			result = 31 * result + remainingItems;
			return result;
		}
	}

	// Dynamic programming top down
	public int topDownRecursive(int values[], int weights[], int W)
	{
		// map of key(remainingWeight, remainingCount) to maximumValue they can
		// get.
		Map map = new HashMap();
		return topDownRecursiveUtil(values, weights, W, values.length, 0, map);
	}

	public int topDownRecursiveUtil(int values[], int weights[],
			int remainingWeight, int totalItems, int currentItem,
			Map<Index, Integer> map)
	{
		// if currentItem exceeds total item count or remainingWeight is less
		// than 0 then
		// just return with 0;
		if (currentItem >= totalItems || remainingWeight <= 0)
			return 0;

		// fom a key based on remainingWeight and remainingCount
		Index key = new Index();
		key.remainingItems = totalItems - currentItem - 1;
		key.remainingWeight = remainingWeight;

		// see if key exists in map. If so then return the maximumValue for key
		// stored in map.
		if (map.containsKey(key))
			return map.get(key);
		int maxValue;
		// if weight of item is more than remainingWeight then try next item by
		// skipping current item
		if (remainingWeight < weights[currentItem])
			maxValue = topDownRecursiveUtil(values, weights, remainingWeight,
					totalItems, currentItem + 1, map);
		else
			// try to get maximumValue of either by picking the currentItem or
			// not picking currentItem
			maxValue = Math.max(
					values[currentItem]
							+ topDownRecursiveUtil(values, weights,
									remainingWeight - weights[currentItem],
									totalItems, currentItem + 1, map),
					topDownRecursiveUtil(values, weights, remainingWeight,
							totalItems, currentItem + 1, map));
		// memoize the key with maxValue found to avoid recalculation
		map.put(key, maxValue);
		return maxValue;

	}

	// Dynamic Programming bottom up approach

	static int max(int a, int b)
	{
		return a > b ? a : b;
	}

	// Returns the maximum value that can be put in a knapsack of capacity W
	static int knapSack(int W, int wt[], int val[], int n)
	{
		int i, w;
		int K[][] = new int[n + 1][W + 1];

		// Build table K[][] in bottom up manner
		for (i = 0; i <= n; i++)
			for (w = 0; w <= W; w++)
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]],
							K[i - 1][w]);
				else
					K[i][w] = K[i - 1][w];

		return K[n][W];

	}

	// Driver program to test above function
	public static void main(String args[])
	{
		KnapsackProblem kp = new KnapsackProblem();
		int val[] = new int[]
		{ 2, 2, 4, 5 };
		int wt[] = new int[]
		{ 2, 4, 6, 9 };
		int W = 8;
		int n = val.length;
		System.out.println(knapSack(W, wt, val, n));
		System.out.println(knapSackTopdown(W, wt, val, n));
		System.out.println(kp.topDownRecursive(wt, val, W));
	}
}