package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.City;
import utility.ConnectionManager;

public class CityDAO {
	
	
	public void createCity(City city) throws SQLException, Exception {
		
		String id = city.getCityId();
		String name=city.getCityName();
		
		ConnectionManager cm=new ConnectionManager();
		//insert all the details into database
		
		String sql="insert into MYCITY(CITY-ID,CITY NAME)VALUES(?,?)";
		//Create statement object
		PreparedStatement st= cm.getConnection().prepareStatement(sql);
		
		
		st.setString(1, id);
		st.setString(2, name);
		st.executeUpdate();
		cm.getConnection().close();
	}
	
	
	public City getCityByName(String name) throws SQLException, Exception {
		City city=null;
		ConnectionManager cm=new ConnectionManager();
		//insert all the details into database
		String id = city.getCityId();
		String cityName=city.getCityName();
		String sql="SELECT * FROM MYCITY WHERE (CITY NAME=name)VALUES(?,?)";
		//Create statement object
		PreparedStatement st= cm.getConnection().prepareStatement(sql);
		st.setString(1, id);
		st.setString(2, name);
		st.executeUpdate();
		return city;
		
	}
}
