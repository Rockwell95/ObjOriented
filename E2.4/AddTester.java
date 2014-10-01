/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E2.4*/
 

import java.awt.Rectangle;								//Imports Rectangle method


public class AddTester {

	public static void main(String[] args) {
		
		Rectangle box = new Rectangle(5, 10, 20, 30); 	//Declares new rectangle
		box.add(0, 0);									//Adds point (0, 0) to rectangle, changing its upper left corner location
														//but not the location of the other coordinates 
		
		double height = box.getHeight();				//The next four lines create variables that contain height, width
		double width = box.getWidth();					//top left x coordinate and top left y coordinate, respectively
		double x_coord = box.getX();
		double y_coord = box.getY();
		
		
		System.out.println("Expected X coordinate: 0\nExpected Y coordinate: 0");	//Prints out expected top left x and y coordinates
		System.out.println("Expected height: 40\nExpected width: 25\n");			//Prints out expected rectangle height and width
		
		System.out.println("Actual X coordinate: "+x_coord+"\nActual Y coordinate: "+y_coord);	//Prints out actual top left x and y coordinates
		System.out.println("Actual height: "+height+"\nActual Width: "+width);					//Prints out actual rectangle height and width
	}

}
