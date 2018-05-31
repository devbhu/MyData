package java8.concept;

public class CustomSqrt
{

	/**
	 * @param args
	 */
	
	public static double sqrtCustom(int number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	public static void main(String[] args)
	{
		System.out.println(sqrtCustom(2));

	}

}
