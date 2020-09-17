package com.training.classes;

import com.training.ifaces.Rent;

public class Furnitures implements Rent {

	private int quantity;
	private double cost;
	private int daysOfRent;
	public Furnitures(int quantity, double cost, int daysOfRent) {
		super();
		this.quantity = quantity;
		this.cost = cost;
		this.daysOfRent = daysOfRent;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getDaysOfRent() {
		return daysOfRent;
	}
	public void setDaysOfRent(int daysOfRent) {
		this.daysOfRent = daysOfRent;
	}
	@Override
	public double rentPerDay() {
		// TODO Auto-generated method stub
		Double rent=this.getQuantity()*this.getCost();
		return rent;
	}
	@Override
	public double totalRent() {
		// TODO Auto-generated method stub
		double totalRent= rentPerDay()*this.getDaysOfRent();
		return totalRent;
	}

}
