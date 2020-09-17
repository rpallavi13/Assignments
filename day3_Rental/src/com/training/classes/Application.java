package com.training.classes;

import java.util.Scanner;

import com.training.ifaces.Rent;

public class Application{

	public static void main(String[] args)
	{
		Object[] productList= new Object[100];
		int ch,key,k=0;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1-Computer 2-Furniture");
			key=sc.nextInt();
		switch (key) {
		case 1: Computers computer=new Computers(3,50000.00,6);
				System.out.println("Rent for computer="+computer.getRent());
				productList[k]=computer;
				k++;
				break;
		case 2: Furnitures furniture=new Furnitures(6,90000.00,3);
				System.out.println("Rent for furniture="+furniture.getRent());
				productList[k]=furniture;
				k++;
				break;
		default:
				System.out.println("Wrong value");
		}
		System.out.println("Do you want to continue?"+"\n"+"Choose 1-No"+"\n"+"Choose 2-Yes");
		ch=sc.nextInt();
		}
		while(ch==2);
		System.out.println("value of k="+k);
		double totalRent=0.0;
		for(int i=0;i<k;i++)
		{
			totalRent+=((Rent) productList[i]).getRent();
			
		}
		System.out.println("Your total rent = "+totalRent);
		sc.close();
		
	}
}
