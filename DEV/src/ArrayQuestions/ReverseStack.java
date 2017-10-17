package ArrayQuestions;

public class ReverseStack
{

	/**
	 * @param args
	 */
	
	static int []   f(int a[]){
		a[0]=5;
		return a;
	}
	public static void main(String[] args)
	{
	int 	a[] ={ 1,3,4,5};
	System.out.println(f(a));
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}

	}

}
