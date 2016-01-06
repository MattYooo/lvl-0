import javax.swing.JOptionPane;

public class memememeee {
	public static void main(String[] args) {
		String weeb = "0";
		String meemee = JOptionPane.showInputDialog(null, "r u happy as a living clam");
		if (meemee.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Kwl Kwl");
		}
		if (meemee.equalsIgnoreCase("no") || meemee.equalsIgnoreCase("nah") || meemee.equalsIgnoreCase("nah fam")) {
			weeb = JOptionPane.showInputDialog(null, "do u care m8?");
		}
		if (weeb.equalsIgnoreCase("yes")) {
			JOptionPane.showInputDialog(null, "change something, kk?");

		}
		if (weeb.equalsIgnoreCase("no") || weeb.equalsIgnoreCase("nah") || weeb.equalsIgnoreCase("nah fam")) {
			JOptionPane.showMessageDialog(null, "keep on meme'n on fam");

		}
	}
}
