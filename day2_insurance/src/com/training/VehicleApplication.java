package com.training;

public class VehicleApplication extends InsuredPerson {

	@Override
	public double calculatePremium() {
		VehicleInsurance car=new VehicleInsurance("2",2019,54000.00);
			double premium=0.0;
			if(car.getVehicleModel().equals("2"))
			{   
				if(car.getYearOfManufacture() <=2020 && car.getYearOfManufacture() >=2018)
				{
					premium=0.5*car.getCostOfVehicle();
				}
				else
				{
					premium=0.6*car.getCostOfVehicle();
				}
			}
			else if(car.getVehicleModel().equals("4"))
			{   
				if(car.getYearOfManufacture() <=2020 && car.getYearOfManufacture() >=2018)
				{
					premium=0.4*car.getCostOfVehicle();
				}
				else
				{
					premium=0.5*car.getCostOfVehicle();
				}
			}
		return premium;
	}
	
	
}

