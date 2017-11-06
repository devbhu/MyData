package online.travel.agent.services;

import java.sql.SQLException;

import online.travel.agent.dao.CountryDaoImpl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;



public class CreateCountryService implements ApplicationContextAware {
	
	
	private static ApplicationContext context;
	
	public  static CreateCountryService  getServiceInstance(){
		
		return context.getBean("CreateCountry",CreateCountryService.class);
	    
	}
	
	
	@Autowired
	private CountryDaoImpl countryDao;
	
	public void save(int id ,String name) throws SQLException{
		
			countryDao.save(id , name);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		context = applicationContext;
		
	}
	
	
	
	
	

}
