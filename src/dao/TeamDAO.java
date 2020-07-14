package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.City;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO {
	 public void createTeam(Team team) throws SQLException, Exception {

			String name = team.getName();
			String coach=team.getCoach();
			String captain=team.getCaptain();
			City city=team.getCity();
			ConnectionManager cm=new ConnectionManager();
			//insert all the details into database
			
			String sql="insert into TEAM(NAME,COACH,CAPTAIN,CITY)VALUES(?,?)";
			//Create statement object
			PreparedStatement st= cm.getConnection().prepareStatement(sql);
			
			
			st.setString(1, name);
			st.setString(2, coach);
			st.setString(3, captain);
			st.setObject(4, city);
			st.executeUpdate();
			cm.getConnection().close();

	 }
}
