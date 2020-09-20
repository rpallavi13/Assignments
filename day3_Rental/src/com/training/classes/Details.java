package com.training.classes;

public class Details {
	private int quantity;
	private double cost;
	private int daysOfRent;
	public Details(int quantity, double cost, int daysOfRent) {
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
	
}
