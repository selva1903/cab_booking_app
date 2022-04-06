package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dataBaseConnection.Databasecon;
import model.UserDetails;

public class UserDAO {
public static int exceqution(String query) throws Exception {
	Connection connection = Databasecon.getConnection();
	Statement statement = connection.createStatement();
	int rows = (int) statement.executeLargeUpdate(query);
	System.out.println("number of rows=" + rows);
	connection.close();
	return rows;
}
	public static int insert(UserDetails details) throws Exception {
		String query = null;
		int t = 0;
		StringBuilder querystr1 = new StringBuilder();
		try {

			query="insert into cabbooking_app_users (user_id,name,email_id,password,phonenumber) values   ('"+details.userid+"','"+details.name+"','"+details.emailid+"','"+details.password+"','"+details.phonenumber+"')";
			System.out.println(query);
			t = exceqution(query);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return t;
	}

	@SuppressWarnings("finally")
	public static int checkValidation(String userMailId, String userPass) throws Exception {
		String query = null;
		int result = 0;
		StringBuilder querystr = new StringBuilder();
		Connection connection = Databasecon.getConnection();
		Statement statement = connection.createStatement();
		try {

			query="select  email_id,password from cabbooking_app_users where email_id =  '"+userMailId+"' or password = '"+userPass+"'";
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				result++;
			}
		} catch (Exception e) {
			connection.close();
			e.printStackTrace();
		} finally {

			return result;
		}
	}
	public static int loginCheck(String userMailId, String userPass) throws Exception {
		String query = null;
		int result = 0;
		StringBuilder querystr = new StringBuilder();
		Connection connection = Databasecon.getConnection();
		Statement statement = connection.createStatement();
		try {

			query="select  email_id,password from cabbooking_app_users where email_id =  '"+userMailId+"' and password = '"+userPass+"'";
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				result++;
			}
		} catch (Exception e) {
			connection.close();
			e.printStackTrace();
		} finally {

			return result;
		}
	}

}
