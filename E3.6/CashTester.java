/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E3.6*/

public class CashTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CashRegister register1 = new CashRegister();
		
		register1.recordPurchase(10.0);
		register1.recordPurchase(11.0);
		register1.recordPurchase(12.0);
		
		register1.printReceipt();
	}

}
