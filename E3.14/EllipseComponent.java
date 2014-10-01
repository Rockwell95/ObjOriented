/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E3.14*/

import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

@SuppressWarnings("serial")							//Added at the request of Eclipse to solve an apparent error
public class EllipseComponent extends JComponent{
	
	public void paintComponent(Graphics g){			//Creates ellipses
		
		Graphics2D g2 = (Graphics2D) g;
		
		int borderWidth = getWidth();				//Sets the width of the larger ellipse to the frame width
		int borderHeight = getHeight();				//Sets the height of the larger ellipse to the frame width
		
		int width = getWidth()-20;					//Sets the width of the smaller ellipse to the frame width less twenty pixels
		int height = getHeight()-20;				//Sets the height of the smaller ellipse to the frame width less twenty pixels
		
		EllipseMaker el1 = new EllipseMaker(0,0,borderWidth,borderHeight,Color.BLACK);	//Creates larger ellipse
		EllipseMaker el2 = new EllipseMaker(10,10,width,height,Color.BLUE);				//Creates smaller ellipse, moving it so it is centred
																						//Inside the larger ellipse, making the larger ellipse
																						//Resemble a border
		//Draws the ellipses.
		el1.draw(g2);
		el2.draw(g2);
	}

}
