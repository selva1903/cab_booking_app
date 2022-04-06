package logic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import DAO.UserDAO;
import dataBaseConnection.Databasecon;
import model.UserDetails;

public class UserRegistation {

	@SuppressWarnings("finally")
	public int registstation( ) {
		UserDetails obj = new UserDetails();
		String userMailId = obj.getEmailid();
		String userPass	= obj.getPassword();
		int verify = 1;
		try {
			if (!userMailId.isBlank() && !userMailId.isEmpty() && !userPass.isBlank() && !userPass.isEmpty()) {
				if (userMailId.contains("@gmail.com")) {
					verify = UserDAO.checkValidation(userMailId, userPass);
					System.out.println(" valid" + verify);
				} else {
					System.out.println("not valid");
				}
			} else {
				System.out.println("not valid");
			}
		} catch (Exception ep) {

			System.out.println(ep.getMessage());
		} finally {
			return verify;
		}
	}
}