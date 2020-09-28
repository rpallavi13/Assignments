package com.training;

public class VehicleMain{

	public static void main(String[] args) {
		VehicleApplication vehicleApplication=new VehicleApplication() ;
		double premium=vehicleApplication.calculatePremium();
		System.out.println("Vehicle premium==>"+premium);

	}

}
