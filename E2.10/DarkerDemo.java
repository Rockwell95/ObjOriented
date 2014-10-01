/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E2.10*/

import java.awt.Color;						//Imports Color method and all sub-methods

public class DarkerDemo {

	public static void main(String[] args) {
		
		Color c2 = Color.RED.darker().darker();	//Creates the color "c2" by taking Color.RED and applying the darker() method twice
		
		
		//The following lines assign the RGB colour values of c1 to integers red, green, and blue, respectively
		int red = Color.RED.getRed();		
		int green = Color.RED.getGreen();
		int blue = Color.RED.getBlue();

		
		//The following lines assign the RGB colour values of c2 to integers red1, green1, and blue1, respectively
		int red1 = c2.getRed();
		int green1 = c2.getGreen();
		int blue1 = c2.getBlue();
		
		//Prints out introduction
		System.out.println("After applying the darker method twice to the Color.RED object, the original and resulting RGB values are as follows:");
		
		//Prints out RGB values of Color.RED before it was darkened
		System.out.println("\nRed: "+red+"\nGreen: "+green+"\nBlue: "+blue);
		
		//Prints out RGB values of c2, which is simply Color.RED with darker() applied to it twice.
		System.out.println("\nDarker Red: "+red1+"\nGreen: "+green1+"\nBlue: "+blue1);
		
		
	}

}
