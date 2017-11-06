package online.travel.agent.dao;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class AbstractDao {
	
   @Autowired 
   private  BasicDataSource dataSource;	
   
   static {
	   
	   new ClassPathXmlApplicationContext("application-context.xml");
	   
	   
   }
		
   protected DataSource getDataSource(){
    	
    	
    	
		return null;
    	
    	
    	
    	
    }
	
	
}
