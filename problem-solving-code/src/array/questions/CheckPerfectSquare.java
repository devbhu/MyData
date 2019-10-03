package array.questions;

public class CheckPerfectSquare
{
	
	public static int findSqrt(int n)
	{
		int l = 0;
		int h = n;
		int mid = 0;
		boolean flag = false;
		while (l < h)
		{
			mid = (l + h) / 2;
			if (mid * mid == n)
			{
				flag = true;
				break;
			} else if (mid * mid > n)
			{
				h = mid;
			} else if (mid * mid < n)
			{
				l = mid + 1;
			}

		}
		if (flag)
			return mid;
		else
			return -1;

	}
	
	public static boolean isPerfect(int n)
	{
		int l = 0;
		int h = n;
		int mid = 0;
		boolean flag = false;
		while (l < h)
		{
			mid = (l + h) / 2;
			if (mid * mid == n)
			{
				flag = true;
				break;
			} else if (mid * mid > n)
			{
				h = mid;
			} else if (mid * mid < n)
			{
				l = mid + 1;
			}

		}
		return flag;

	}

	public static void main(String[] args)
	{
		int n = 25;
       System.out.println(findSqrt(144));
		System.out.println(n+" is  perfect square ? " + isPerfect(n));

	}

}
