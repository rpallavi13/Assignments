package com.training;

public class ManageProduct {

	
public void showProducts()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("product");
		}
	}
	public double calculateTax(Product product)
	{
		switch (product.getProductType())
		{
			case 1 : return (5.0);
			case 2 : return(10.0);
			case 3 : return(15.0);
			default : return(28.0);
		}
	}
	public void showProductsLegacy(Product[] productList)
	{
		for(int i=0;i<productList.length;i++)
		{
			//System.out.println("product: "+i+ "=>"+productList[i].getProductName());
			System.out.println(productList[i]);
		}
	}
	public void showProductForEach(Product[] productList)
	{
		for(Product eachProduct : productList)
		{
			System.out.println(eachProduct.getProductName()+"."+eachProduct.getRatePerUnit());
		}
	}
	
public Product[] calculateDiscount(Product[] productList) {
		double discount=0.0;
		for (Product eachProduct: productList)
		{
			if(eachProduct.getRatePerUnit()>500 && eachProduct.getRatePerUnit()<=1000)
			{
				discount=0.10;
			}
			else if(eachProduct.getRatePerUnit()>1000)
			{
				discount=0.15;
			}
			eachProduct.setDiscount(discount);
		}
		return productList;
}
public double calculateAmount(Product product)
{	
		double amount=product.getQuantity() * product.getRatePerUnit() - (product.getDiscount() * product.getRatePerUnit());
		return amount;
}

	

}

