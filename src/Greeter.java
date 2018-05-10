import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	
	String answer = JOptionPane.showInputDialog(null, "Hello, my name is NuclearAcid360, what is your name?");
	JOptionPane.showMessageDialog(null, answer + ", very nice name");
}
}