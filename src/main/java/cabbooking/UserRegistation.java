package cabbooking;

import DAO.UserDAO;

public class UserRegistation {

	

	@SuppressWarnings("finally")
	public int registstation(String userMailId, String userPass) {
		int verify = 1;
		try {
			if (!userMailId.isBlank() && !userMailId.isEmpty() && !userPass.isBlank() && !userPass.isEmpty()) {
				if (userMailId.contains("@gmail.com")) {
					verify = UserDAO.checkValidation(userMailId, userPass);
					System.out.println(" valid" + verify);
				} else
				{
					System.out.println("not valid");
				}
			} else 
			{
				System.out.println("not valid");
			}
		} catch (Exception ep) 
		{
			System.out.println(ep.getMessage());
		} finally
		{
			return verify;
		}
		
	}

	
}