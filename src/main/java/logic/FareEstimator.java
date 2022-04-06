package logic;

import com.display_cab.OrderDAO;
import java.util.Scanner;
import model.CabDetails;

public class FareEstimator {
	static Scanner sc=new Scanner(System.in);
	
	public static void OrderDetails() throws Exception {
	
		CabDetails cab=OrderDAO.Order();
		System.out.println("Your details:");
		System.out.println("Travel_id:"+cab.travel_id+"\nPickup:"+cab.pickup+"\nDestination:"+cab.destination+"\nPrice per kms:"+cab.price_per_kms);
		Fare(cab);

		
}
	public static void Fare(CabDetails cab) {
		System.out.println("Enter kms:");
		int kms=sc.nextInt();
		int fare=kms*(cab.price_per_kms);
		System.out.println("Your total price is "+fare);
	}
}