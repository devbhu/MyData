package java.lang;

import java.util.Scanner;

// count all distinct binary string of length N with no consecutive 1's
public class BinaryString
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenth of String");
		int n = sc.nextInt();
		int c0, c1, total;
		c1 = 1;
		c0 = 2;
		total = 0;
		for (int i = 2; i <= n; i++)
		{

			total = c0 + c1;
			c1 = c0;
			c0 = total;
		}
		System.out.println("All distinct binary string of length " + n
				+ "  with no consecutive 1's " + total);
	}

}
