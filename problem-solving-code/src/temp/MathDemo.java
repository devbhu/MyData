package temp;

public class MathDemo {

   public static void main(String[] args) {

      // get two double numbers
      double x = 19;
      double y = -497.99;
   
      // get the natural logarithm for x
      System.out.println("Math.log(" + x + ")=" + Math.log(x));
   
      // get the natural logarithm for y
      System.out.println("Math.log(" + y + ")=" + Math.log(y));
      if(Math.log(x)%Math.log(2)==0)
      System.out.println("true");
      else 
    	  System.out.println("false");
    	  
   }
}