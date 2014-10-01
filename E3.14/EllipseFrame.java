/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E3.14*/

import javax.swing.JFrame;

public class EllipseFrame {

	public static void main(String[] args) {
		JFrame ellipse = new JFrame();		//Creates frame for ellipses
		ellipse.setLocation(400, 225);		//Sets location on Screen
		ellipse.setSize(640,480);			//Sets Frame size, can be manually adjusted later
		ellipse.setTitle("The Ellipse");
		
		ellipse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		EllipseComponent comp = new EllipseComponent();	//Calls EllipseComponent.class
		
		ellipse.add(comp);								//Adds ellipses to frame
		
		ellipse.setVisible(true);						//Makes frame visible
	}

}
