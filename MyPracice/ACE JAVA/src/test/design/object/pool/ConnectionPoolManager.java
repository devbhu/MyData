package test.design.object.pool;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionPoolManager extends ObjectPoolResource<ConnectionPool>{
    
	private static final AtomicInteger counter = new AtomicInteger(); 
	
	public ConnectionPoolManager(int initialSize) {
		super(initialSize);
	}

	@Override
	protected ConnectionPool createObject() {
	  
		return new ConnectionPool(new Date(),"Connection Pool-"+counter.incrementAndGet());
	}

	
}
