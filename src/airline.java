// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/

public class airline 
{
	public static void main(String[] args) {
		
	
	
	String answer0=JOptionPane.showInputDialog("first name?");
	String answer1=JOptionPane.showInputDialog("last name?");
	String answer2=JOptionPane.showInputDialog("destination airport?");
	String answer3=JOptionPane.showInputDialog("birthday?");
	String answer4=JOptionPane.showInputDialog("male or female?");
	JOptionPane.showMessageDialog(null,"Name "+answer1+ ", " +answer0+ " Birth date " +answer3+ " M/F " +answer4+ " Destination airport " +answer2);
	
	}

}