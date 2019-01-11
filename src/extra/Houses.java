package extra;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String args[]) {
		Robot robot = new Robot();
		robot.setX(10);
		robot.setY(550);
		robot.setSpeed(255);
		robot.setWindowColor(10, 10, 10);
		Random random = new Random();
		// random = random.nextInt(400);
		Color color = Color.BLACK; // new Color; //((int)(Math.random() * 0x1000000));

		for (int i = 0; i < 10; i++) {
			color = new Color((int) (Math.random() * 0x1000000));
			drawHouse(robot, random.nextInt(400) + 100, color);
		}

	}

	static void drawHouse(Robot robot, int height, Color color) {
		robot.setPenColor(color);
		robot.setAngle(0);
		robot.penDown();
		robot.move(height);

		if (height < 300) {
			robot.turn(45);
			robot.move(14);
			robot.turn(90);
			robot.move(14);
			robot.turn(45);
		} else {
			robot.turn(90);
			robot.move(20);
			robot.turn(90);
		}
		robot.move(height);
		robot.turn(-90);
		robot.setPenColor(Color.GREEN);
		robot.move(20);

	}
}
