package com.chainsys.day2;

public class TestClinic {
	
	//private static final String Dk = null;

	public static void main(String[] args) {
		Clinic hos1=new Clinic();
		hos1.name ="PS hospital";
		hos1.docNo="12";
		hos1.room=250;
		hos1.available="Scan room, Lab, Blood Bank";
		hos1.address="10, North Street, Pasupathipalayam, karur-639004";
		hos1.speciality="Neuro, ortho, Dental, Cardio";
		
		System.out.println("Name of the Clinic: "+hos1.name);
		System.out.println("No. of Doctors; "+hos1.docNo);
		System.out.println("No. of InPataient Rooms: "+hos1.room);
		System.out.println("Available Services: "+hos1.available);
		System.out.println("Adress: "+hos1.address);
		System.out.println("Speciality care: "+hos1.speciality);
		
		
		
	}
}
