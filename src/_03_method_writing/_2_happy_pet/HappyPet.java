package _03_method_writing._2_happy_pet;

import javax.swing.*;

public class HappyPet {

    // 1. Add the following variable to the next line: static int happinessLevel = 0;
    // this will be used to store the happiness of your pet

    static int happinessLevel = 0;

    public static void main(String[] args) {
        // 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
        String pet = JOptionPane.showInputDialog(null, "What pet do you want to buy?");
        // 3. REPEAT steps 4 - 7 enough times to make your pet happy!
        for (int i = 0; i < 6; i++) {


            // 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
            //    (eg: cuddle, food, water, take a walk, groom, clean up poop).
            //    Make sure to customize the title and question too.
            int task = JOptionPane.showOptionDialog(null, "How do you wanna make your pet happy?", "ඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞඞ", 0, JOptionPane.INFORMATION_MESSAGE, null,
                    new String[]{"Cuddle", "Feed", "Water", "Take a Walk", "Groom", "Clean Poop"}, null);

            // 6. Use user input to call the appropriate method created in step 5 below.
            if (task == 0) {
                cuddle(pet);
            }
            else if (task == 1) {
                feed(pet);
            }
			else if (task == 2){
				water(pet);
			}
			else if (task == 3){
				walk(pet);
			}
			else if(task == 4){
				groom(pet);
			}
			else {
				poop(pet);
			}

            // 7. If you determine the happiness level is large enough, tell the
            //    user that he loves his pet and use break; to exit for loop.
			if (happinessLevel>=50){
				JOptionPane.showMessageDialog(null, "You took great care of your pet!");
				break;
			}
        }
    }

    // 5. Create methods to handle each of your user selections.
    //    Each method should create a pop-up with the pet's response (eg. cat might purr when pet),
    //    and INCREMENT the pet's happiness Level.
    public static void cuddle(String pet) {
        JOptionPane.showMessageDialog(null, "Your " + pet + " is sleeping.");
        happinessLevel = happinessLevel + 15;
    }

    public static void feed(String pet) {
        JOptionPane.showMessageDialog(null, "Your " + pet + " is energetic.");
        happinessLevel = happinessLevel + 10;
    }
	public static void water(String pet){
		JOptionPane.showMessageDialog(null,"Your "+ pet +" is happy.");
		happinessLevel = happinessLevel + 10;
	}
	public static void walk(String pet){
		JOptionPane.showMessageDialog(null,"Your "+pet+" is tired.");
		happinessLevel = happinessLevel + 5;
	}
	public static void groom(String pet){
		JOptionPane.showMessageDialog(null,"Your "+pet+" is relaxed.");
		happinessLevel = happinessLevel + 10;
	}
	public static void poop(String pet){
		JOptionPane.showMessageDialog(null,"Your "+pet+" doesn't really care.");
	}
}
