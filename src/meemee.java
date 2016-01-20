
import java.net.URI;

import javax.swing.JOptionPane;

public class meemee {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String bob=JOptionPane.showInputDialog("hew manee cets doh yoo huv");
		// 2. Convert their answer into an int
int blob= Integer.parseInt(bob);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if(blob>=4){
	JOptionPane.showMessageDialog(null, "u ah crazee cet ladoy");
}
		// 4. If they have 3 or less, call the method below to show them a cat video
if(blob<=3){

	playVideo("https://www.youtube.com/watch?v=4pTLmhZCzbQ");
}
else if(blob<=0){
	playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

