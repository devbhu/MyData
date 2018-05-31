package miscellaneous.questions;

import static java.lang.Integer.*;

import java.util.ArrayList;
//import static java.lang.Integer.*;
public class importstatictest {

    public static void main(String args[]) {
      
    	
    	
    	ArrayList l1 = new ArrayList();
    	l1.add(10);
    	l1.add(20);
    	l1.add(30);
    	System.out.println("l1--->"+l1);
    	ArrayList l2 = new ArrayList(l1);
    	l2.add(1,5);
    	l2.add(3,5);
    	l2.add(5,15);
    	System.out.println("l2--->"+l2);
    	ArrayList l3 = new ArrayList(l2);
    	System.out.println("l3--->"+l3);
       //without Static import
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
      
        //after static import in Java 5
       System.out.println(MAX_VALUE);
       System.out.println(MIN_VALUE);
    }
}
