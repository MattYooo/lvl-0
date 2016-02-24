import javax.swing.JOptionPane;

public class meme {
	public static void main(String[] args) {
		String meme = JOptionPane.showInputDialog("how old are you");
		int m3m3 = Integer.parseInt(meme);
		if (m3m3 <= 17) {
			JOptionPane.showMessageDialog(null, "grow up man");
		} else if (m3m3 > 18) {
			String lol = JOptionPane.showInputDialog("who do you wanna vote for");
			if (lol.equalsIgnoreCase("Donald Trump")) {
				JOptionPane.showMessageDialog(null, "what are you stupid");
			} else if (lol.equalsIgnoreCase("Hillary Clinton")) {
				JOptionPane.showMessageDialog(null, "fighting for us");

			}
		}
	}

}
0.