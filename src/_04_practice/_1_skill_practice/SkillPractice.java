package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;


public class SkillPractice {
		
		public static void main(String[] args) {

			SkillPractice skills = new SkillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String dime = JOptionPane.showInputDialog(null,"How many dimes do you have?");
		int dimes = Integer.parseInt(dime);
		int cents = dimes*10;

		// Tell them how many cents they have (hint multiply by 10)
		JOptionPane.showMessageDialog(null, "You have "+cents+" cents.");



		// Ask the user how tall they are (inches)
		String inch = JOptionPane.showInputDialog(null,"How tall are you?");
		int inches = Integer.parseInt(inch);


		// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (inches<=36) {
			JOptionPane.showMessageDialog(null,"Eat your wheaties lol");
		}



		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console
			for (int i = 0; i<30; i++) {
				if (i % 3 == 0) {
					System.out.println(i);
				}
			}






		}

		void skill3() { // Get a random number that is less than 20 and print it to the console
			Random ran = new Random();
			int ran20 = ran.nextInt(20);
			System.out.println(ran20);

		// Get another random number that is less than 10 and print it to the console
			int ran10 = ran.nextInt(10);
			System.out.println(ran10);


		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
			JOptionPane.showMessageDialog(null, ran20-ran10);


		}

		void skill4() { // In a pop-up, ask the user for the city they live in
			String city = JOptionPane.showInputDialog(null, "What city do you live in?");
			


		// If they answered "San Diego", tell them they live in America's Finest City
			if (city.equalsIgnoreCase("san diego")) {
				JOptionPane.showMessageDialog(null, "You live in America's finest city.");
			}


		// Otherwise, tell them to move to San Diego
			else {
				JOptionPane.showMessageDialog(null, "You should move to San Diego.");
			}


		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
			String cars = JOptionPane.showInputDialog(null, "How many cars do you have?");
			int car = Integer.parseInt(cars);

		// If there is 1 car, use a pop-up to display the make/model of the car
			if (car==1) {
				JOptionPane.showMessageDialog(null, "your car is a toyota corrola");
			}


		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.
			if (car>1) {
				
			}


		}

		void skill5() { // In a pop-up, ask the user for the name of their school



		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.



		}
}


