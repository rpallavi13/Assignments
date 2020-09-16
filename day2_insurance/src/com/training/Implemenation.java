package com.training;

public class Implemenation {

		public static void main(String[] args) {
			
			InsuredPerson insuredPerson=new InsuredPerson();
			double premium=insuredPerson.calculatePremium();
			System.out.println("Premium==>"+premium);
			
		}
	}

