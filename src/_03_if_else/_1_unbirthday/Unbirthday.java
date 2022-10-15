package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String birthday = "When is your birthday?";
String lucky = "Wow! Happy birthday!";
String notsurprised = "Not surprised";
String input = JOptionPane.showInputDialog(birthday);
if (input.equals("10/15")) {

	JOptionPane.showMessageDialog(null, lucky);
}else {
JOptionPane.showMessageDialog(null, notsurprised);
}
}
}