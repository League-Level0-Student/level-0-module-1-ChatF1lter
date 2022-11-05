package _05_for_loops._2_badgers;

import javax.swing.JOptionPane;

public class Badgers {
public static void main(String[] args) {
int b = 0;
int m = 0;
for(int verse=0;verse<2;verse++) {
	for(b=0;b<13;b++) {
		System.out.print(" badger");
	}
	for(m=0;m<2;m++) {
		System.out.println(" mushroom");
	}
}
System.out.println("A snake!!!");
}
}