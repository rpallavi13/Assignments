package com.training;

public class InsuredPerson {
		public double calculatePremium()
		{	Insurance insurance=new Insurance(112,"Rahul",42,52000.00);
			double premium;
			if(insurance.getAge()<25)
			{
				premium=0.6 * insurance.getInsuredAmount();
			}
			else
			{
				premium=0.7 * insurance.getInsuredAmount();
			}
			return premium;
		}
}
