package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lawyer rajesh=new Lawyer(49494,"Rajesh Khannan","High Court","B.L");
		Musician sharma=new Musician(12122,"Umesh Khanna","Guitar","Delhi");
		Billing bill=new Billing();
		bill.printFees(rajesh);
		bill.printFees(sharma);
	}

}
