import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

@SuppressWarnings("serial")
public class TargetComponent extends JComponent {
	
	public void paintComponent(Graphics g){
		
		Graphics2D g2 = (Graphics2D) g;
		
		//Gets the dimensions of the window holding the targets, which will be used as a basis for the ellipses.
		int width = getWidth();
		int height = getHeight();
		
		//Creates five ellipses, alternating black and white. The second is 20% smaller than the first, the third 40% smaller
		//The fourth 60% smaller and the fifth 80% smaller. The indicated coordinated centre all the ellipses at the center of the
		//original ellipse
		Target t1 = new Target(0,0,width,height, Color.BLACK);
		
		Target t2 = new Target(((width/5)/2),((height/5))/2,width-(width/5),height-(height/5), Color.WHITE);
		
		Target t3 = new Target(((2*(width/5))/2),(2*(height/5))/2,width-2*(width/5),height-2*(height/5), Color.BLACK);
		
		Target t4 = new Target(((3*(width/5))/2),(3*(height/5))/2,width-3*(width/5),height-3*(height/5), Color.WHITE);
		
		Target t5 = new Target((2*(width/5)),(2*(height/5)),width-4*(width/5),height-4*(height/5), Color.BLACK);
		
		//Draws the ellipses.
		t1.draw(g2);
		t2.draw(g2);
		t3.draw(g2);
		t4.draw(g2);
		t5.draw(g2);
		
	}
	
}
