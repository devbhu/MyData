package temp;

public class AlivePerson
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n=1000;
		int binaryNo=2;
		for(int i=1;i<=100;i++){
			binaryNo=binaryNo*2;
			if(binaryNo>n)
				break;
		}
		
		System.out.println("alive person :"+(1-binaryNo+2*n));

	}

}
