package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
String good = "Correct!";
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String input = JOptionPane.showInputDialog(null, "What has to be broken before you use it? (Just write one word)" );
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(input.equals("egg")) {
	JOptionPane.showMessageDialog(null, good);
	score =+10000;
} else {
	 JOptionPane.showMessageDialog(null, "Wrong!" );
	score =-10000;
}
		// 5. Otherwise, say "wrong" and tell them the answer
	
		// 6. Add some more riddles
input = JOptionPane.showInputDialog(null, "I am an odd number. Take away a letter and I become even. What number am I?" );
if(input.equals("seven")) {
	JOptionPane.showMessageDialog(null, good);
	score =+10000;
} else {
	 JOptionPane.showMessageDialog(null, "Wrong!" );
	score =-10000;
}
		// 2. Make a pop up to show the score.
	JOptionPane.showMessageDialog(null, "Your score is" + score);
	
}
}

