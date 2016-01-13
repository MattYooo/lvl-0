import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
	/**
	 * Fizz Buzz
	 * 
	 * In this project, we're going to build FizzBuzz. It's a children's game where
	 * you count from 1 to 20. Easy, right? Here's the catch: instead of saying
	 * numbers divisible by 3, say "Fizz". And instead of saying numbers divisible
	 * by 5, say "Buzz". For numbers divisible by both 3 and 5, say "FizzBuzz".
	 * 
	 * So the rules are:
	 * 		Any number divisible by 3 is replaced by the word Fizz 
	 * 		Any number divisible by 5 is replaced by the word Buzz. 
	 * 		Numbers divisible by both 3 and 5 become FizzBuzz.
	 * 
	 * Print your results to the console, or using JOptionPane if you like.
	**/

	public class GOTOJAIL {
		public static void main(String[]args){
			int hungis=0;
			for (int i = 0; i < 1; i--) {
				hungis++;
				if(hungis%5==0 && hungis%3==0){
					JOptionPane.showMessageDialog(null, "λθλ");
					
				}
					else if(hungis%3==0){
					JOptionPane.showMessageDialog(null, "FIZZFOOD" );
				}
					else if(hungis%5==0){
					JOptionPane.showMessageDialog(null, "BUZZFEED" );
				}
					else{
						JOptionPane.showMessageDialog(null, hungis);
					}
			}
			
		}
		

	}




