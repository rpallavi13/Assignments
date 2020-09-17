package com.training.example.two;

import com.training.ifaces.Automobile;

public class Car implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "RED";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "WAGANAR";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 50000.00;
	}

}
