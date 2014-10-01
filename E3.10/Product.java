/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E3.10*/


public class Product {
	
	private String productName = "";
	private double productPrice = 0;
	
	public Product(){
		//Sets initial product values to null and 0, respectively
	}
	
	public Product(String name, double price){
		
		//Creates instance variables for name and price, respectively
		productName = name;
		productPrice = price;
	}
	
	public String getName(){	//Creates a method that returns the name of the product
		
		return productName;
	}
	
	public double getPrice(){	//Creates a method that returns the price of the product
		
		return productPrice;
	}
	
	public void reducePrice(double reducePrice){	//Reduces the price of the product
		
		productPrice -= reducePrice;
	}

}
