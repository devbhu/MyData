class TestCustomException1 extends Exception{  
	TestCustomException1(String s){  
  super(s);  
 }  
} 

class InvalidAgeException{  
	  
	   static void validate(int age)throws TestCustomException1{  
	     if(age<18)  
	     throw new TestCustomException1("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	    	  InvalidAgeException.validate(3);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  