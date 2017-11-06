package online.travel.agent.services;

import java.sql.SQLException;

import online.travel.agent.dao.HotelDaoImpl;
import online.travel.agent.model.Hotel;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CreateHotelService implements ApplicationContextAware {

	private static ApplicationContext context;

	public static CreateHotelService getServiceInstance() {

		return context.getBean("CreateHotel", CreateHotelService.class);

	}

	@Autowired
	private HotelDaoImpl hotelDaoImpl;

	public void save(Hotel hotel) throws SQLException {
		hotelDaoImpl.save(hotel);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		context = applicationContext;

	}

}
