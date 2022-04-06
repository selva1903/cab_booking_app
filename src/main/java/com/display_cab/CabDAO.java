package com.display_cab;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import model.CabDetails;

	public class CabDAO {
		
					public static List<CabDetails> busDAO() throws Exception {
					Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					System.out.println(connection);
					String query="select * from cabbooking_userdisplay";
					Statement statement=connection.createStatement();
					ResultSet rs=statement.executeQuery(query);
					List<CabDetails> list=new ArrayList<CabDetails>();
					int id=0;
					String cartype=null;
					String pickup=null;
					String destination=null;
					int price=0;
					while(rs.next()) {
						id=rs.getInt("travel_id");
						cartype=rs.getString("car_type");
						pickup=rs.getString("pickup");
						destination=rs.getString("destination");
						price=rs.getInt("price_in_kms");
						CabDetails cab=new CabDetails(id,cartype,pickup,destination,price);
						list.add(cab);
					}
					return list;
				}
			}

