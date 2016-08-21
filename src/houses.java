import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class houses {

	public static void main(String[] args) {
		Tortoise.getBackgroundWindow().setColor(Color.black);
		Tortoise.turn(180);
		Tortoise.move(60);
		Tortoise.turn(180);
		Tortoise.turn(90);
		Tortoise.move(500);
		Tortoise.turn(270);
		houses("small", "green");
		houses("small", "green");
		houses("medium", "green");
		houses("large", "yellow");
		houses("medium", "white");
		houses("small", "pink");
		houses("large", "red");
		houses("small", "yellow");
		houses("large", "red");
		houses("medium", "blue");
		houses("large", "red");
	
	
	}

	static void houses(String size, String Colory) {
		int height = 0;
		
		if (size.equals("small")) {
			height = height + 60;
		}
		if (size.equals("medium")) {
			height = height + 120;
		}
		if (size.equals("large")) {
			height = height + 250;
		}
		if (Colory.equals("green")) {
			Tortoise.setPenColor(Color.GREEN);
		}
		if (Colory.equals("black")) {
			Tortoise.setPenColor(Color.BLACK);
		}
		if (Colory.equals("yellow")) {
			Tortoise.setPenColor(Color.YELLOW);
		}
		if (Colory.equals("red")) {
			Tortoise.setPenColor(Color.RED);
		}
		if (Colory.equals("blue")) {
			Tortoise.setPenColor(Color.blue);
		}
		if (Colory.equals("pink")) {
			Tortoise.setPenColor(Color.PINK);
		}
		if (Colory.equals("white")) {
			Tortoise.setPenColor(Color.WHITE);
		}
		Tortoise.penDown();
		Tortoise.turn(270);
		Tortoise.move(20);
		Tortoise.turn(90);
		Tortoise.move(height);
		Tortoise.turn(315);
		Tortoise.move(30);
		Tortoise.turn(270);
		Tortoise.move(30);
		Tortoise.turn(315);
		Tortoise.move(height);
		Tortoise.turn(180);
	}
}
