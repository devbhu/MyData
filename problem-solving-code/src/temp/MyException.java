package temp;


class CustomException extends Exception{
	CustomException(String s){
		super(s);
	}
}
public class MyException
{

	public static void main(String[] args) throws CustomException
	{
		System.out.println("dev");
		/*
		if(true){
			throw new CustomException("sorry");
		}*/

	}

}
