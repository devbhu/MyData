package temp;

public class StackOverflowDemo
{
	 int i =0;
	{
		
		while(i<0){
			 StackOverflowDemo d = new StackOverflowDemo();
		i++;
		}
	}
	
	
	{
		System.out.println("first");
	}
	{
		System.out.println("second");
	}
	
	StackOverflowDemo(){
	
		System.out.println("ArrayDemo constr");
	}
	public static void main(String[] args)
	{/*   
		while(true){
		try{
		int a[] = new int [Integer.MAX_VALUE];
		//a[0]=23423;
		System.out.println(Integer.MAX_VALUE);
	    }catch(Throwable e){
	    	e.printStackTrace();
	    }
		}

	*/
		
		new StackOverflowDemo();
		}

}
