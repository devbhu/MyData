package java.lang;

import java.util.ArrayList;

public class C
{
    

    public static void main(String [] args) {
    	// print when the program starts
    	   System.out.println("Program starting...");
    	   

    	   // get the current runtime assosiated with this process
    	   Runtime run = Runtime.getRuntime();
    	   System.out.println("total " + run.totalMemory());
    	   // print the current free memory for this runtime
    	   
    	   ArrayList al =new ArrayList();
    	   al.add("dev");
    	   al.add("dev");
    	   al.add("dev");
    	   al.add("dev");
    	   al.add("dev");
    	   
    	   System.out.println("freememory " + run.freeMemory());
    }

}
