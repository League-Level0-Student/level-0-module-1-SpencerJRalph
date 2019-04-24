import javax.swing.JOptionPane;

public class TheRiddler {
public static void main(String[] args) {
	int score = 0;
	String hi=JOptionPane.showInputDialog("What stays in a corner, but can travel across the world?");
	if (hi.equals("a stamp")) {
		score++;
	}
	else {
		JOptionPane.showMessageDialog(null, "you are wrong. the right answer was a stamp");
	}
	String h=JOptionPane.showInputDialog("what has an eye but cannot see");
	if (h.equals("a needle")) {
		score++;
	}
	else {
		JOptionPane.showMessageDialog(null, "you are wrong. the right answer is a needle");
	}
}
}
