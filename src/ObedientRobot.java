import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static public void main( String args[]) {
		Robot myRobot = new Robot();
		myRobot.setX(30);
		myRobot.setY(200);
		myRobot.setSpeed(200);
		myRobot.setPenColor(Color.BLUE);
		drawSquare(myRobot);
		drawTriangle(myRobot);
	}
	
	public static void drawSquare(Robot rob)
	{
		rob.show();
		rob.penDown();
		for (int i = 0; i < 4; i++) {
			// 1. Move the robot the distance of the starSize variable
			rob.move(50);
			// 3. Turn the robot 144 degrees
			rob.turn(90);
		}
		rob.penUp();
		rob.hide();
		rob.setX(rob.getX()+150);

	}

	public static void drawTriangle(Robot rob)
	{
		rob.show();
		rob.penDown();
		for (int i = 0; i < 3; i++) {
			// 1. Move the robot the distance of the starSize variable
			rob.move(50);
			// 3. Turn the robot 144 degrees
			rob.turn(120);
		}
		rob.penUp();
		rob.hide();
		rob.setX(rob.getX()+150);

	}
}
