import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		
String password="hello";
String secretMessage=JOptionPane.showInputDialog("Can i share a secret message");
System.out.println(secretMessage);
JOptionPane.showInputDialog("You can only have secret message if you guess the pascode, what is the passcode?");
if (password.equals("hello")) {
	JOptionPane.showMessageDialog(null, "the secret message is :" + secretMessage);
	
}

}
}
