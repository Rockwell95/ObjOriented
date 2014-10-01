import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class Target {
	
	//Instance variables for length, width, coordinates and colour.
	private int xComp;
	private int yComp;
	private int width;
	private int height;
	private Color color;
	
	public Target(int x, int y, int w, int h, Color c){		//Constructor for an ellipse, taking into account coordinates
															//Dimensions and colour.
		xComp = x;
		yComp = y;
		width = w;
		height = h;
		color = c;
	}
	
	public void draw(Graphics2D g2){
		Ellipse2D.Double e1 = new Ellipse2D.Double(xComp,yComp,width,height);	//Creates ellipse
		
		g2.setColor(color);														//Assigns ellipse colour
		g2.fill(e1);															//Fills ellipse with aforementioned colour
	}
}
