package com.training.classes;

import java.util.Scanner;

public class Application{

	public static void main(String[] args)
	{
		Computers computer=new Computers(3,50000.00,6);
		Furnitures furniture=new Furnitures(6,90000.00,3);
		System.out.println("1-Computer 2-Furniture");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		if(key==1)
		{      System.out.println(furniture.totalRent());
			   System.out.println(computer.rentPerDay());
		}
		else {
				System.out.println(furniture.totalRent());
				System.out.println(computer.rentPerDay());
			}
		sc.close();
		
	}
}
