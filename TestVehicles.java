package com.chainsys.day2;

public class TestVehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles v1 = new Vehicles();
		v1.name = "Ducati";
		v1.modelNo = "D417";
		v1.regNum = "TN 47 M 2002";
		v1.type = "Two Wheeler";
		v1.milege = 25;

		System.out.println("Vehicle Name:" + v1.name + "\n Model No.:" + v1.modelNo + "\n Registration No:" + v1.regNum
				+ "\n " + " Vehicle Type:" + v1.type + "\n Milege in Km:" + v1.milege);

	}

}
