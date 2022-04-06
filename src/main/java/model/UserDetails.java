package model;

public class UserDetails {

public static int userid = 0;
	
	public static String name = null;
	
	public static String emailid= null;
	
	public static String password = null;
	
	public static String phonenumber = null;
	
	public UserDetails(String userid, String name, String role, String emailid, String password,int phonenumber) {
		
		userid = userid;
		name = name;
		role = role;
		emailid  = emailid;
		password=password;
		phonenumber=phonenumber;
	}
	public UserDetails() {
	
	}
	public static int getUserid() {
		return userid;
	}
	public static void setUserid(int userId2) {
		UserDetails.userid = userId2;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		UserDetails.name = name;
	}
	public static String getEmailid() {
		return emailid;
	}
	public static void setEmailid(String emailid) {
		UserDetails.emailid = emailid;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		UserDetails.password = password;
	}
	public static String getPhonenumber() {
		return phonenumber;
	}
	public static void setPhonenumber(String phonenumber) {
		UserDetails.phonenumber = phonenumber;
	}
	
}
