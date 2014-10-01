/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E3.14*/

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class EllipseMaker{
	
	//Instance variables for width, height, x coord, y coord, and colour.
	private int width;
	private int height;
	private int xComp;
	private int yComp;
	private Color color;
	
	//Constructor for ellipse
	public EllipseMaker(int x, int y, int w, int h, Color c){
		xComp = x;
		yComp = y;
		width = w;
		height = h;
		color = c;
	}
	
	//Constructs ellipse
	public void draw(Graphics2D g2){
		Ellipse2D.Double e1 = new Ellipse2D.Double(xComp,yComp,width,height);	//Ellipse has dimensions and coordinates specified by component class
		
		g2.setColor(color);		//Sets ellipse colour
		g2.fill(e1);			//Fills ellipse with aforementioned colour		
	}
}
