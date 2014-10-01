/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E2.8*/

import java.awt.Color;						//Imports Color method and all sub-methods

public class BrighterDemo {

	public static void main(String[] args) {
		
		Color c1 = new Color(50,100,150);	//Declares new color c1
		
		//The following lines assign the RGB colour values of c1 to integers red, green, and blue, respectively
		int red = c1.getRed();		
		int green = c1.getGreen();
		int blue = c1.getBlue();
		
		Color c2 = c1.brighter();			//Creates a new color c2 that is c1 with the brighter() method applied to it 
		
		//The following lines assign the RGB colour values of c2 to integers red1, green1, and blue1, respectively
		int red1 = c2.getRed();
		int green1 = c2.getGreen();
		int blue1 = c2.getBlue();
		
		//Prints out introduction
		System.out.println("After applying the brighter method to the color \"c1\" the resulting RGB values are as follows:");
		
		//Prints out RGB values of c1 before it was brightened
		System.out.println("Original Red: "+red+"\nOriginal Green: "+green+"\nOriginal Blue: "+blue);
		
		//Prints out RGB values of c2, which is simply c1 with brighter() applied to it.
		System.out.println("\n\nBrighter Red: "+red1+"\nBrighter Green: "+green1+"\nBrighter Blue: "+blue1);
		
		
	}

}
