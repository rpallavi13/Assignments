package com.training.classes;

import com.training.ifaces.Rent;

public class Furnitures extends Details implements Rent {

	
	public Furnitures(int quantity, double cost, int daysOfRent) {
		super(quantity, cost, daysOfRent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getRent() {
		// TODO Auto-generated method stub
		double rent= this.getQuantity()*this.getCost()*this.getDaysOfRent();
		return rent;
	}

}
