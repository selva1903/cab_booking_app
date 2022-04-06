package logic;

import java.util.ArrayList;
import java.util.List;

import com.display_cab.CabDAO;

import model.CabDetails;

public class DisplayCar {

	public static void displayAll() throws Exception{
		List<CabDetails> display=new ArrayList<CabDetails>();
		display=CabDAO.busDAO();
		System.out.println("Travel_id   \t"+"Cartype         "+"Pickup          "+"Destination     "+"Price");
		for(CabDetails i: display) {
			System.out.println(i.travel_id+"\t\t"+i.cartype+"     \t"+i.pickup+"    \t"+i.destination+"      "+i.price_per_kms);
		}
	}

}
