package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

public class Main{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args) throws SQLException, Exception {
		TeamDAO team=new TeamDAO();
		CityDAO city=new CityDAO();
		City city1=new City();
		Team team1=new Team();

		System.out.println("1.Enter team");
		System.out.println("2.Create city");
		System.out.println("3.Display city");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		
		switch(x) {
		case 1: System.out.println("Enter name");
			String name=team1.getName();
			System.out.println("Enter coach");
			String coach=team1.getCoach();
			System.out.println("Enter captain");
			String captain=team1.getCaptain();
			System.out.println("Enter city ID");
			String cityId =city1.getCityId();
			System.out.println("Enter city name");
			String cityName=city1.getCityName();
			
			team1.setName(name);
			team1.setCoach(coach);
			team1.setCaptain(captain);
			team1.setCity(city1);
			
			team.createTeam(team1);
			break;
		
		case 2:System.out.println("Enter city name");
			String id=city1.getCityId();
			System.out.println("Enter city name");
			String nameOf=city1.getCityName();
			
			city1.setCityId(id);
			city1.setCityName(nameOf);
			
			city.createCity(city1);
			break;
			
		case 3: System.out.println("Enter city name");
				String name2=br.readLine();
				city.getCityByName(name2);
				break;
		default: System.out.println("Wrong input");
		}
	}
}
