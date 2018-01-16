package miscellaneous.questions;

import java.io.*;

public class AlternavelyPositiveNegativeNumberInArray
{

	public static void main(String[] args) throws IOException
	{
		/*
		 * BufferedReader br =new BufferedReader(new
		 * InputStreamReader(System.in));
		 * System.out.println("Please enter Array size"); int
		 * n=Integer.parseInt(br.readLine()); int a[]=new int[n]; int j=0,i=0;
		 * System.out.println("Please enter Array elements"); for(
		 * i=0;i<a.length;i++) a[i]=Integer.parseInt(br.readLine());
		 */
		int i, j;
		i = j = 0;
		int a[] =
		{ -2, 4, 5, -6, 7 };
		for (i = 0; i < a.length; i++)
		{
			// if(i%2==0){
			if (a[i] < 0 && i % 2 == 0)
			{
				j = i + 1;
				continue;
				// a[j]=a[i];
				// j=i+1;
			} else if (a[i] > 0 && i < a.length - 1)
			{
				if (a[i + 1] < 0)
				{
					int tmp = a[j];
					a[j] = a[i + 1];
					a[i + 1] = tmp;
					j++;
				}

			}
			if (a[i] > 0 && i % 2 != 0)
			{
				j = i + 1;
				continue;

			} else if (a[i] < 0 && i < a.length - 1)
			{
				if (a[i + 1] > 0)
				{
					int tmp = a[j];
					a[j] = a[i + 1];
					a[i + 1] = tmp;
					j++;
				}

			}

		}

		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

	}

}
