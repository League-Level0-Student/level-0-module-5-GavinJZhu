package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		//2. Set the speed to 100
		rob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "what color now pick", "mnbvcxzlkjhgfdsapoiuytrewq", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", ""}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice == 0) {
			rob.setPenColor(255,0,0);
		}
		
		//4. Ask the use how many polygons they want to be drawn.
		
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

