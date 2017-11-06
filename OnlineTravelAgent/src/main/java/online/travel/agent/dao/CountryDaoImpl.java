package online.travel.agent.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CountryDaoImpl {

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

	public void save(int id, String name) {

		// template.execute("select * from dual");
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = dataSource.getConnection();
			statement = connection
					.prepareStatement("Insert into country(country_id,country_name) values (?,?)");
			statement.setInt(1, id);
			statement.setString(2, name);
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
	
	public int getCountryId(String country){
		// template.execute("select * from dual");
				Connection connection = null;
				PreparedStatement statement = null;
				int countryId=-1;
				try {
					connection = dataSource.getConnection();
					statement  = connection.prepareStatement("SELECT country_id  FROM COUNTRY  WHERE country_name  = ?");
					statement.setString(1,country);
					ResultSet rs = statement.executeQuery();
					while (rs.next()) {
						countryId = rs.getInt("country_id");
					}
					return countryId;
				} catch (SQLException sqe) {
					sqe.printStackTrace();
					return -1;
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
