import javax.swing.JFrame;

public class TargetViewer {

	public static void main(String[] args){
		
		//Creates a frame, sets its size, location and title
		JFrame target = new JFrame();
		target.setSize(640,640);
		target.setLocation(400,225);
		target.setTitle("Target");
		
		target.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TargetComponent tgt = new TargetComponent();	//Calls the TargetComponent.class
		
		target.add(tgt);								//Adds target to to the frame
		
		target.setVisible(true);						//Makes the frame visible
	}
}
