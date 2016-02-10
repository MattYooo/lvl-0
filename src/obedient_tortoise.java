import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;




public class obedient_tortoise {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		String color = JOptionPane.showInputDialog("What color would you like, Red, Blue, or Green?");
		if(color.equalsIgnoreCase("blue")){
			Tortoise.setPenColor(Color.BLUE);
		}
		else if(color.equalsIgnoreCase("red")){
			Tortoise.setPenColor(Color.RED);
		}
		else if(color.equalsIgnoreCase("green")){
			Tortoise.setPenColor(Color.GREEN);
		}
		String shape = JOptionPane.showInputDialog("What shape do you want, Triangle, Square, or Circle?");
		if (shape.equalsIgnoreCase("square")){ 
			wombibus();
		}
		else if (shape.equalsIgnoreCase("triangle")){
		wombum();
		}
		else if (shape.equalsIgnoreCase("circle")){
		wombis();
		}
	}

	private static void wombis() {
		for (int i = 0; i < 360; i++) {

			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}

	private static void wombum() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(70);
			Tortoise.turn(120);
		}
	}

	private static void wombibus() {
		for (int i = 0; i < 4; i++) {

			Tortoise.move(70);
			Tortoise.turn(90);
		}

	}
}
