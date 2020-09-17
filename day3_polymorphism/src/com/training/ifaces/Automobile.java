package com.training.ifaces;

public interface Automobile {
//the following attribute is of type public static final by default
	String APPNAME="Quotation Generation System";
	
	public abstract String getColor();
	public String getModel();
	double getPrice();
}
