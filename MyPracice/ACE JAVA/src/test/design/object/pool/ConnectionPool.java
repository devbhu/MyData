package test.design.object.pool;

import java.util.Date;

public class ConnectionPool {
    
	private final Date date;
	private final String name;
	
	public ConnectionPool(Date date, String name) {
		
		this.date = date;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "ConnectionPool [date=" + date + ", name=" + name + "]";
	}

}
