//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot myRobot = new Robot();
		Random rand = new Random();
		Color color = Color.white;
		int colorNumber;
		while (true) {
			// 3. Ask the user what color they would like the robot to draw
			String input = JOptionPane.showInputDialog("What color?");
			if (input.equals("red")) {
				color = Color.red;
			} else if (input.equals("blue")) {
				color = Color.blue;
			} else if (input.equals("green")) {
				color = Color.green;
			}
			// 5. Use an if/else statement to set the pen color that the user requested
			if (input.equals("")) {
				colorNumber = rand.nextInt(3);
				if (colorNumber == 0) {
					color = Color.blue;
				} else if (colorNumber == 1) {
					color = Color.red;
				} else if (colorNumber == 2) {
					color = Color.green;
				}
			}
			myRobot.setPenColor(color);

			// 6. If the user doesn’t enter anything, choose a random color

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10
			myRobot.setPenWidth(10);
			myRobot.setSpeed(200);
			myRobot.penDown();

			// 2. Make the robot draw a shape (this will take more than one line of code)
			for (int i = 0; i < 5; i++) {
				// 1. Move the robot the distance of the starSize variable
				myRobot.move(250);
				// 3. Turn the robot 144 degrees
				myRobot.turn(144);

			}
			myRobot.penUp();

		}
	}
}