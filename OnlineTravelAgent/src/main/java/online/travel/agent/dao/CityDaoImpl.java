package online.travel.agent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CityDaoImpl {


	@Autowired
	private BasicDataSource dataSource;

	@Autowired
	private JdbcTemplate template;
	
	@Autowired
	private CountryDaoImpl countryDao;

	/*
	 * public BasicDataSource getDataSource() { return dataSource; }
	 * 
	 * public void setDataSource(BasicDataSource dataSource) { this.dataSource =
	 * dataSource; }
	 */

	public void save(int id, String cityname, String countryname) {

		// template.execute("select * from dual");
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = dataSource.getConnection();
			statement = connection
					.prepareStatement("Insert into city(CITY_ID ,CITY_NAME,CITY_COUNTRY_ID ) values (?,?,?)");
			statement.setInt(1, id);
			statement.setString(2, cityname);
			statement.setInt(3, countryDao.getCountryId(countryname));
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
