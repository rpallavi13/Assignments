package com.training.example.two;

import java.util.Scanner;

import com.training.ifaces.Automobile;

public class Application {
	
	public static void main(String[] args)
	{	int key,ch;
		Scanner sc=new Scanner(System.in);
		ShowRoom saiCars=new NewShowRoom();
		do {
		System.out.println("Enter key value: 1-Bike  2-Car 3-Tractor");
		key=sc.nextInt();
		Automobile selected=saiCars.getProduct(key);
			if(selected==null)
			{
				System.out.println("You have selected a wrong option");
			}
			else
			{
				saiCars.printEstimate(selected);
			}
		System.out.println("Do you want to continue?");
		System.out.println("Choose 1-No");
		System.out.println("Choose 2-Yes");
		ch=sc.nextInt();
		}while(ch==2);
		sc.close();
	}

}
