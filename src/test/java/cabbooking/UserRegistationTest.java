package cabbooking;
import model.UserDetails;
import java.util.Scanner;
import DAO.UserDAO;

public class UserRegistationTest {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner (System.in);
		int option = 0;
		
		String Useremailid = "selva25072@gmail.com";
		String Userpassword= "avles12345";
		UserDetails obj1 = new UserDetails();
		obj1.setEmailid(Useremailid);
		obj1.setPassword(Userpassword);
		UserRegistation obj = new UserRegistation();
		int a = obj.registstation(Useremailid,Userpassword) ;
		 if(a == 1) {
			 System.out.println("invalid email or password");
		 }else {
			 int userId = 1212 ;
			 String name = "selva25072";
			 String phoneNumber = "8270047174";
			 obj1.setUserid(userId);
			 obj1.setName(name);
			 obj1.setPhonenumber(phoneNumber);
			 UserDAO.insert(obj1);
			 
		 }

	}

}
