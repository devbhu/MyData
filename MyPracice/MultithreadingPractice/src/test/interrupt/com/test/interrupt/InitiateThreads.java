package com.test.interrupt;

import java.util.Scanner;

public class InitiateThreads {
	
	public static void main(String[] args) {
	   
	System.out.println("Start the thread1 . Enter 1 to start the First Thread !!");	
       Scanner scan = new Scanner(System.in);
       int input = scan.nextInt();
       StartThread start = null;
       ThreadController controller=null;
       if(input==1){
    	   controller = new ThreadController();
    	   start= new StartThread(controller);
    	   start.setName("First Thread");
    	  // start.setDaemon(true);
    	   start.start();
    	   
       }
       
       System.out.println("You want to stop the first thread ? (Y/N)");
       
       String secondInput = scan.next();
    	   
       if("Y".equalsIgnoreCase(secondInput)){
    	   
    	   StopThread stop = new StopThread(start, controller);
    	   stop.start();
       }
		
		
		
	}

}
