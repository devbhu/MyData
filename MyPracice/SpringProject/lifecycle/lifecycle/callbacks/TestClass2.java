package lifecycle.callbacks;

public class TestClass2 {
   
	 public void setValue(String value){
		 
		 System.out.println("Value is "+value);
	 }
	 
	
	public void initialization() {

		System.out.println("initialization method called !!!");
	}

	public void clear() {

		System.out.println("clear method called!!");
	}

}
