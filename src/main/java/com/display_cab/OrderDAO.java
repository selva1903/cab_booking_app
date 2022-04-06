package com.display_cab;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import dataBaseConnection.Databasecon;
import model.CabDetails;
public class OrderDAO {
	static Scanner sc=new Scanner(System.in);
	public static CabDetails Order() throws Exception {
		int choice=0;
		System.out.println("Enter travel_id");
		choice=sc.nextInt();
		CabDetails cab=matchOrder(choice);
		return cab;
		}
	public static CabDetails matchOrder(int choice) throws Exception {
		int id=0;
		String cartype=null;
		String pickup=null;
		String destination=null;
		int price=0;
		Connection connect=Databasecon.getConnection();
		String query="select travel_id,car_type, pickup,destination,price_in_kms from cabbooking_userdisplay where travel_id="+choice+"";
		Statement statement=connect.prepareStatement(query);
		ResultSet rs=statement.executeQuery(query);
		if(rs.next()) {
			id=rs.getInt("travel_id");
			cartype=rs.getString("car_type");
			pickup=rs.getString("pickup");
			destination=rs.getString("destination");
			price=rs.getInt("price_in_kms");
		}
		else {
			throw new Exception("Enter valid travel_id");
		}
		CabDetails cab=new CabDetails(id,cartype,pickup,destination,price);
		return cab;
	}
}
