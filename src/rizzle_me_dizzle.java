import javax.swing.JOptionPane;



	public class rizzle_me_dizzle {

		public static void main(String[] args) {
			

			// 1. Make a variable to hold the score
			int applesauce=0;
			// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
			String answer=JOptionPane.showInputDialog(null, "what walks on 4 legs in the morning, 2 legs mid day, and 3 legs in the evening?");
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if(answer.equals("humans")){
				applesauce=1;
				String answer1=JOptionPane.showInputDialog("good job heres another. it flys, it eats, and it gives life, yet it is not living?");
				if(answer1.equals("water")){
					applesauce=2;}
					else{
						applesauce=1;
						JOptionPane.showMessageDialog(null, "wrong, the answer is water");
					}
			
			}
			else{
				JOptionPane.showMessageDialog(null, "wrong, the answer is humans YOU LOSE");
				applesauce=-1;
			}
			
			
			// 5. Otherwise, say "wrong" and tell them the answer
			
			// 6. Add some more riddles

			// 2. Make a pop up to show the score.
			JOptionPane.showMessageDialog(null, "your score is "+ applesauce);
		}
	}



