package com.chainsys.day2;

public class TestHotel {

	public static void main(String[] args) {

		Hotel ho1 = new Hotel();
		ho1.name = "Sumathi Recidency";
		ho1.totalAvailable = 120;
		ho1.available = 52;
		ho1.catogeries = "Single, Double, Villa, Party Hall";
		ho1.services = "Daily maintanance, Spa, Gym";
		ho1.address = "44, South Nagar,\n Trichy";
		ho1.website = "www.sumathirecidency.com";

		System.out.println("Hotel Name: " + ho1.name + "\n No. Of Rooms: "+ho1.totalAvailable
				+"\n No. of Available Rooms: "+ho1.available +"\n Room Catogories: "+ho1.catogeries +"\n Services: "+
				ho1.services+"\n Address: "+ho1.address+"\n Website: "+ho1.website);

	}

}
