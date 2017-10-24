package com.test.interrupt;

public class ThreadService {
	
	public static ThreadService threadService  = new ThreadService();
	
	
	public void doWork(){
		
			System.out.println( Thread.currentThread().getName() + "............ is runnting ........ ");
		
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			/*while(true){
			if(Thread.interrupted()){
				
				System.out.println( Thread.currentThread().getName() + "......... is interrupted..........");
				//break;
		
		     }
              if(Thread.currentThread().isInterrupted()){
				
				System.out.println( Thread.currentThread().getName() + "......... is interrupted..........");
				break;
		
		     }
		}*/
	}
	
 public void doWork2(){
		
		StopThread thread2 = (StopThread)Thread.currentThread();
		
		thread2.getThread().interrupt();
	}


}
