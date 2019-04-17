import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String hi=JOptionPane.showInputDialog("what is your birthday");
	if (hi.equals("04/16")){
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
	JOptionPane.showMessageDialog(null, "Have a very merry UNbirthday");
}
}
