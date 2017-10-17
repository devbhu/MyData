import java.util.ArrayList;
import java.util.*;

public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int a=1;
		try{
			 a =a;
			//System.exit(0) ;
			//return;
			
		}
		catch(ArithmeticException aq){
			System.out.println("catch");
		}
		finally{
			System.out.println("finally");
		}
		
		System.out.print(Math.sqrt(5));

	}

}
