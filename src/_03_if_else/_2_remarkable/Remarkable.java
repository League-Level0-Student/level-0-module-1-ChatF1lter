package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Question = "Enter a name";	
String Ben = "You're really tall";
String Nick = "You're really good at coding";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String input = JOptionPane.showInputDialog(Question);
if (input.equals("Ben")) {
	JOptionPane.showMessageDialog(null, Ben);
}
if (input.equals("Nick")){
	JOptionPane.showMessageDialog(null, Nick);
}

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

