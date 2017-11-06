package online.travel.agent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import online.travel.agent.model.Hotel;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class HotelDaoImpl {


	@Autowired
	private BasicDataSource dataSource;

	@Autowired
	private JdbcTemplate template;
	

	/*
	 * public BasicDataSource getDataSource() { return dataSource; }
	 * 
	 * public void setDataSource(BasicDataSource dataSource) { this.dataSource =
	 * dataSource; }
	 */

	public void save(Hotel hotel) {

		// template.execute("select * from dual");
		if(hotel == null){
			return;
		}
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = dataSource.getConnection();
			statement = connection
					.prepareStatement("Insert into hotel(HOTEL_ID ,HOTEL_CITY_ID,HOTEL_COUNTRY_ID,HOTEL_NAME,HOTEL_ADDRESS,HOTEL_DISCRIPTION,HOTEL_MOBILENUMBER,HOTEL_EMAIL,HOTEL_TELEPHONENUMBER,HOTEL_AMENITIES,HOTEL_LATITUDE,HOTEL_LONGITUDE ) values (?,?,?,?,?,?,?,?,?,?,?,?)");
			
			statement.setInt(1, hotel.getHotelId());
			statement.setInt(2, hotel.getHotelCityId());
			statement.setInt(3, hotel.getHotelCountryId());
			statement.setString(4, hotel.getHotelName());
			statement.setString(5, hotel.getHotelAddress());
			statement.setString(6, hotel.getHotelDiscription());
			statement.setInt(7, hotel.getHotelMobNo());
			statement.setString(8, hotel.getEmailId());
			statement.setInt(9, hotel.getTelephoneNo());
			statement.setString(10, hotel.getHotelAmenities());
			statement.setInt(11, hotel.getLatitude());
			statement.setInt(12, hotel.getLongitude());
			
			statement.executeUpdate();
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} finally {
			if(statement != null){
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
		}
	}



}
