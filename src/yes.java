

	import org.jointheleague.graphical.robot.Robot;
	import java.awt.Color;


	/*** Teacher's note ***/
	 /* Before beginning recipe: 
	 * 1. ask students to find and explain the variable in this recipe. 
	 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs. */

	public class yes {
		public static void main(String[] args) {

			int baseSize = 300;		//the size of the black part of the star
			int flameSize = 200;		//the length of the flaming arms

			// 1. Make a new robot, and set it's pen down.
			Robot fart = new Robot("vic");
			fart.moveTo(962, 400);
			fart.penDown();
			// *14. Use the methods setX and setY to move the ninja star into the center of the screen
			//done true story bro
			// *15. Make some adjustments to see what other kinds of shapes you can make.
			
			// 12. Set the robot speed to 10
			fart.setSpeed(9001);
			// 13. Make all the code below repeat 25 times
			for (int i = 0; i < 25; i++) {
				
			
				// 2. Turn the robot 1/8 of a circle
				 fart.turn(360/8);
				// 3. Move the robot 64 pixels
				fart.move(64);;
				
				// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
				fart.turn(-40);
				// 5. Move the robot the distance in the variable flameSize
				fart.setPenColor(Color.GREEN);
				fart.move(baseSize);
				// 6. Turn the robot 170 degrees
				fart.turn(170);
				fart.setPenColor(Color.BLACK);
				// 7. Move the robot the distance in the variable flameSize (again)
				fart.setPenColor(Color.GREEN);
				fart.move(baseSize);
				// 8. Turn the robot 64 degrees to the right
				fart.turn(32);
				fart.setPenColor(Color.BLACK);
				// 9. Move the robot the distance in the variable baseSize
				fart.move(flameSize);
				// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
				//yeah
				// 11. Color your ninja star like Figure 2.
				//done
				
		}

	}
	}

	