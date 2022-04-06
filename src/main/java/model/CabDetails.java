package model;

public class CabDetails {
		public int travel_id;
		public String cartype;
		public String pickup;
		public String destination;
		public int price_per_kms;
		public CabDetails(int travel_id, String cartype, String pickup, String destination, int price_per_kms) {
			super();
			this.travel_id = travel_id;
			this.cartype = cartype;
			this.pickup = pickup;
			this.destination = destination;
			this.price_per_kms = price_per_kms;
		}



	}

