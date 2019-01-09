import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static public void main( String args[]) {
		Robot myRobot = new Robot();
		myRobot.setX(30);
		myRobot.setY(200);
		myRobot.setSpeed(200);
		myRobot.setPenColor(Color.BLUE);
		/*
		drawSquare(myRobot);
		drawTriangle(myRobot);
		drawCircle(myRobot);
		*/
		String input = JOptionPane.showInputDialog("What shape do you want, square, circle, or triangle?");
		String color =  JOptionPane.showInputDialog("What color do you want your shape to be, red, blue, or green?");
		Color shapeColor = Color.WHITE;
		if(color.equals("red"))
		{
			shapeColor = Color.RED;
		} else if (color.equals("blue"))
		{
			shapeColor = Color.BLUE;
		} else if(color.equals("green"))
		{
			shapeColor = Color.GREEN;
		}
		
		if(input.equals("square"))
		{
			drawSquare(myRobot,shapeColor);
		} else if (input.equals("circle"))
		{
			drawCircle(myRobot,shapeColor);
		} else if(input.equals("triangle"))
		{
			drawTriangle(myRobot,shapeColor);
		}
		
	}
	
	public static void drawSquare(Robot rob, Color myColor)
	{
		rob.show();
		rob.penDown();
		rob.setPenColor(myColor);
		for (int i = 0; i < 4; i++) {
			// 1. Move the robot the distance of the starSize variable
			rob.move(150);
			// 3. Turn the robot 144 degrees
			rob.turn(90);
		}
		rob.penUp();
		rob.hide();
		rob.setX(rob.getX()+250);

	}

	public static void drawTriangle(Robot rob, Color myColor)
	{
		rob.show();
		rob.penDown();
		rob.setPenColor(myColor);
		for (int i = 0; i < 3; i++) {
			// 1. Move the robot the distance of the starSize variable
			rob.move(150);
			// 3. Turn the robot 144 degrees
			rob.turn(120);
		}
		rob.penUp();
		rob.hide();
		rob.setX(rob.getX()+250);

	}

	public static void drawCircle(Robot rob, Color myColor)
	{
		rob.show();
		rob.penDown();
		rob.setPenColor(myColor);
		for (int i = 0; i < 36; i++) {
			// 1. Move the robot the distance of the starSize variable
			rob.move(15);
			// 3. Turn the robot 144 degrees
			rob.turn(10);
		}
		rob.penUp();
		rob.hide();
		rob.setX(rob.getX()+250);

	}
}
