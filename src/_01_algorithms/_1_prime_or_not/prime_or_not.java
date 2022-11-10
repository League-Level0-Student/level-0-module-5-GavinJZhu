package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
	String numb = JOptionPane.showInputDialog(null,"Give me a number. I'll tell you if its prime.");
int number = Integer.parseInt(numb);
boolean isPrime = true;	
for (int i = 2; i< number/2; i++) {
	if (number % i == 0) {
		isPrime = false;
		JOptionPane.showMessageDialog(null, "Your number is composite.");
		break;
	}
	}
	if (isPrime) {
		JOptionPane.showMessageDialog(null,"Your number is prime.");
	}


}
}
