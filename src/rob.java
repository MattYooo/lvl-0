import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class rob {
	
	// 2. Create a new Robot
	Robot fr = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Do steps #7 to #8 four times...

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		fr.penDown();
		fr.setSpeed(10);
		fr.setPenWidth(5);
		fr.setRandomPenColor();
		for (int i = 0; i < 4; i++) {
			fr.move(500);
			fr.turn(90);
		}
		fr.turn(90);
		for (int i = 0; i < 4; i++) {
			fr.move(500);
			fr.turn(90);
		}
		fr.turn(90);for (int i = 0; i < 4; i++) {
			fr.move(500);
			fr.turn(90);
		}
		fr.turn(90);for (int i = 0; i < 4; i++) {
			fr.move(500);
			fr.turn(90);
		}
		fr.turn(90);
		
		
		
		
	}

	public static void main(String[] args) { 
		new rob
		
		
		
		
		
		().go();
	}

}



