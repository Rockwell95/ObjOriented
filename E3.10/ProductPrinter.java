/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E3.10*/

public class ProductPrinter {

	public static void main(String[] args) {
		
		Product firstItem = new Product("Computer", 1000);			//Creates first item on list, defined as a computer worth $1000
		Product secondItem = new Product("Operating System", 100);	//Created second item on list, defined as an Operating System worth $100
		
		String item1Name = firstItem.getName();						//Returns the name of the first item to a string
		String item2Name = secondItem.getName();					//Returns the name of the second item to a string
		
		double item1Price = firstItem.getPrice();					//Returns the price of the first item to a double
		double item2Price = secondItem.getPrice();					//Returns the price of the second item to a double
		
		firstItem.reducePrice(5);									//Reduces the first item's price by $5.00
		secondItem.reducePrice(5);									//Reduces the second ite's price by $5.00
		
		double item1ReducedPrice = firstItem.getPrice();			//Returns the reduced price of the first item to a double
		double item2ReducedPrice = secondItem.getPrice();			//Returns the reduced price of the second item to a double
		
		
		//Outputs name and price of products both before and after reduction in price.
		System.out.println("Before Reduction in price:\n"+item1Name+": $"+item1Price+"\n"+item2Name+": $"+item2Price+"\n");
		System.out.println("After Reduction in price:\n"+item1Name+": $"+item1ReducedPrice+"\n"+item2Name+": $"+item2ReducedPrice);

	}

}
