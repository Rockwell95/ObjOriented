/*Name: Dominick Mancini
 * Student ID: 100517944
 * Class: SOFE 2710U
 * Assignment 1, Exercise E2.15*/


public class HalfSizePicture {

	public static void main(String[] args) {
		
		Picture pic = new Picture();			//Creates a new Picture object named "pic"
		
		pic.load("http://shared.uoit.ca/shared/department/communications/images/logo/4_RGB/UOIT_RGB.jpg"); //Loads the picture from an internet link
		
		int height = pic.getHeight();		//Gets the height of the picture
		int width = pic.getWidth();			//Gets the width of the picture
		
		int halfHeight = height/2;			//Takes the height of the picture and halves it. Note that integers are used since there cannot be half pixels
		int halfWidth = width/2;			//Takes the width of the picture and halves it.
		
		pic.scale(halfWidth,halfHeight);	//Scales pic to have half the height and width of its original resoution
		
		pic.move(halfWidth/2, halfHeight/2);//The picture is centred, by having the top left corner moved in and down one half the scaled dimensions

	}

}
