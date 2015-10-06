// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class mgic8bll {
	

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int rndm = new Random().nextInt(5);
	// 3. Print out this variable
		
	// 4. Get the user to enter a question for the 8 ball
		String salty=JOptionPane.showInputDialog("PUT IN A YES OR NO QUESTION IDIOT");
	// 5. If the random number is 0
		if (salty.contains("should I")){
			
			JOptionPane.showMessageDialog(null, " no u shouldnt");
		
	}
		else{
			
		
	// -- tell the user "Yes"
		if (rndm==0){
			JOptionPane.showMessageDialog(null, "yes");
		}
	// 6. If the random number is 1
		
	// -- tell the user "No"
		if (rndm==1){
			JOptionPane.showMessageDialog(null, "no");
		}
	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"
			if (rndm==2){
				JOptionPane.showMessageDialog(null, "ask google stumped");
			}
	// 8. If the random number is 3

	// -- write your own answer
				if (rndm==3){
					JOptionPane.showMessageDialog(null, "oh god no, no, noooooooooooooooooooooo");
				}
				if (rndm==4){
					JOptionPane.showMessageDialog(null, "dude idunno just eat some carrotcake");
			
				}
				
		}
	}
}



