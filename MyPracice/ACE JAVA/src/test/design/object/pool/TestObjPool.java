package test.design.object.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestObjPool {
	
  	

  public static void main(String[] args) {
	
	  
	 ExecutorService service  = Executors.newCachedThreadPool();
	 
	 ConnectionPoolManager manager = new ConnectionPoolManager(10);
	 
	 for(int i=0;i<20;i++){
		 
		 service.execute(new Task(manager));
	 }
	  
	 service.shutdown();
	  
	  
  }
	
	
}
