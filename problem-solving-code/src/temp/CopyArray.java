package temp;

public class CopyArray
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     int a[]={1,2,3,4,5};
     int b[]={6,7,8,9,10,11};
     System.arraycopy(a, 1, b, 1, 2);
     for(int b1:b){
    	 System.out.println(b1);
    	 
     }
     
	}

}
