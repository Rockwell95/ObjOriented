/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E3.6*/

//Please note, the question 3.6 that required this class requested that I add on to the class. This class, with the exception of the
//printReceipt is the work of the textbook

/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;
   private String priceList;										//NEW: Added new Instance Variable priceList

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
      priceList = "";
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
      priceList = priceList.concat(String.valueOf(amount))+"\n";	//NEW: priceList takes input amount, parses it into a String, and then drops to a new line
      																//It then adds another amount entry for however many times are needed.
   }

   /**
      Processes a payment received from the customer.
      @param amount the amount of the payment
   */
   public void receivePayment(double amount)
   {
      payment = payment + amount;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
  
   //NEW: Receipt printing method.
   public void printReceipt(){
	   
	   
	   System.out.println(priceList);					//Prints out the list of prices
	   System.out.println("Amount due: "+purchase);		//Prints out the amount due.
   }
}
