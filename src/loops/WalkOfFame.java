
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setX(30);
		rob.setSpeed(200);
		rob.setPenColor(Color.RED);
		rob.show();
		
		for (int j = 0; j < 15; j++) 
		{
			// 2. Make the robot draw a star shape. Hint: 144.
			rob.penDown();
			for (int i = 0; i < 5; i++) 
			{
				// 1. Move the robot the distance of the starSize variable
				rob.move(30);
				// 3. Turn the robot 144 degrees
				rob.turn(144);
				// 3. Set the size of the star to 30.

				/** THE CHALLENGE: **/
				/*
				 * Make the robot draw a line of stars like this: http://bit.ly/walkOfFame
				 * 
				 * Hint: The distance between stars is 50.
				 */
			}
			rob.penUp();
			rob.setX(rob.getX() + 50);		
			
		}
		rob.hide();
	}
}
