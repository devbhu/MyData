package test.design.object.pool;

public class Task implements Runnable{
   
	private final ConnectionPoolManager connectionManager;
	
	public Task(ConnectionPoolManager connectionManager){
		this.connectionManager = connectionManager;
	}
	
	@Override
	public void run() {
		
		 ConnectionPool connection= connectionManager.getResource();
		 
		 System.out.println("Acquired ----"+connection);
		 
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 System.out.println("Releasing ----"+connection);
		 connectionManager.releaseObject(connection);

	}
	
	
	

}
