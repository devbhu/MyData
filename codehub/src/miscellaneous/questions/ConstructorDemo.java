package miscellaneous.questions;

class a{
	static {
		System.out.println("parent static");
		
	}
	{
		System.out.println("parent instance");
	}
	a(){
		System.out.println("parent constructor");
	}
}

class bbb extends a{
	static {
		System.out.println("child static");
		
	}
	{
		System.out.println("child instance");
	}
	bbb(){
		super();
		System.out.println("child constructor");
	}
}
public class ConstructorDemo
{

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		bbb obj=new bbb();

	}

}
