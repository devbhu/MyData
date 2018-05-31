package temp;

public class addTwoNo {

	/**
	 * @param args
	 */
	static int Add(int x, int y)
	{
	    // Iterate till there is no carry  
	    while (x != 0)
	    {
	        // carry now contains common set bits of x and y
	        int carry = x & y;  
	        System.out.println("carry"+carry); 
	 
	        // Sum of bits of x and y where at least one of the bits is not set
	        y = x ^ y; 
	        System.out.println("y"+y); 
	        // Carry is shifted by one so that adding it to x gives the required sum
	        x = carry << 1;
	        System.out.println("x"+x); 
	    }
	    return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=3;
      int b=6;
     // int c=0;
      /*if(a<b){
    	  c=a;
    	  for(int i=1;i<=b;i++)
    		  c++;
      }
      else if(a>b){
    	  c=b;
    	  for(int i=1;i<=a;i++)
    		  c++;
      }
      else if(a==b)
      {
    	  c=a;
    	  for(int i=1;i<=b;i++)
    		  c++;
      }*/
    	System.out.println("sum"+Add(a,b)); 
    		  
	}

}
