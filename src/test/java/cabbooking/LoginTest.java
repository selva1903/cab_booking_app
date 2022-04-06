package cabbooking;

import cabbooking.UserRegistation;
import model.UserDetails;
import java.util.Scanner;
import DAO.UserDAO;
public class LoginTest {

	public static void main(String[] args) throws Exception {
		
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner (System.in);
		int option = 0;
		String Useremailid = "selva25072@gmail.com";
		String Userpassword= "avles12345";
		UserDetails obj1 = new UserDetails();
		obj1.setEmailid(Useremailid);
		obj1.setPassword(Userpassword);
		
		int a = UserDAO.loginCheck(Useremailid, Userpassword);
		 if(a == 1) {
			 System.out.println("login successfull");
		 }else {
			 System.out.println("login unsuccessfull");
		 }

	}

}





		
