package online.travel.agent.services;

import java.sql.SQLException;

import online.travel.agent.dao.CityDaoImpl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CreateCityService implements ApplicationContextAware {

	private static ApplicationContext context;

	public static CreateCityService getServiceInstance() {

		return context.getBean("CreateCity", CreateCityService.class);

	}

	@Autowired
	private CityDaoImpl cityDao;

	public void save(int id, String cityname , String countryname) throws SQLException {
		cityDao.save(id, cityname,countryname);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		context = applicationContext;

	}

}
