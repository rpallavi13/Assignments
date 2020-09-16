package com.training;

public class Application {

	public static void main(String[] args) {
		
		ManageProduct mgr=new ManageProduct();
		Product tv = new Product(1010,"LED TV",5000.00,2,1,10.00);
		Product fridge = new Product(2001,"LG fridge",23000.00,1,2,40.00);
		double tax=mgr.calculateTax(tv);
		System.out.println("Tax :==>"+tax);
		Product[] productList = new Product[2];
		productList[0]=tv;
		productList[1]=fridge;
		
		//mgr.showProductForEach(productList);
		//mgr.showProductsLegacy(productList);
		double price;
		mgr.calculateDiscount(productList);
			for(Product eachProduct: productList)
			{	
				System.out.println("Product name==>"+eachProduct.getProductName());
				System.out.println("Discount==>"+eachProduct.getDiscount());
				price=mgr.calculateAmount(eachProduct);
				System.out.println("Price==>"+price);
			}
		

	}

}
