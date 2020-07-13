package temp;

import java.util.ArrayList;
import java.util.*;

public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{List<String> myList = Arrays.asList("INDIA", "AUSTRALIA", "ENGLAND", "NEWZEALAND", "SCOTLAND");
		System.out.println("------- Lambda Expression --------");

		// Using Lambda function to call system.out.println()
		myList.stream().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("------- Method Reference ---------");

		// Using Method reference to call system.out.println()
		myList.stream().map(String :: toUpperCase)
				.forEach(System.out::println);

	}

}
