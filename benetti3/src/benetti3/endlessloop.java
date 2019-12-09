// Valeria Benetti 2183227
package benetti3;

// Write a program that deliberately contains an endless or infinite while loop. 
// The loop should generate multiplication questions with single digit random integers. 
// Users can answer the questions and get immediate feedback. 
// After each question, the user should be able to stop the questions and get an overall result.
// Example Output

import java.util.Scanner;


public class endlessloop {
	
	public static void main(String[] args) {
		int correctCount = 0; // Keep count of the correct question
        int count = 0; // count all the question
        Scanner input = new Scanner(System.in);



        String option;

        do {
            // Create two random single-digit
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);  

            //prompt the user to answer "what is number1 * number2"
            System.out.print("What is " + number1 + " * " + number2 + "? ");
            int answer = input.nextInt();
            input.nextLine();

            //grade the answer and display the result
            if (number1 * number2 == answer)
            {
                System.out.println("You are correct! Nice Work!");
                correctCount++; //increase the correct answer count

            }
            else
            {
            	// If user put in the wrong answer, tell them they are wrong plus show the correct anser
                System.out.println("Your answer is worng. The product should be: " + (number1 * number2));
            }

            count++;

            System.out.println("\nWould you like more questions?");
            System.out.print(" Y or N ");

            option = input.nextLine().trim();
        } while (option.equalsIgnoreCase("Y"));
        System.out.println("\nYou've answered " + correctCount + " out of " + count + " Correct");
		
	}
	
}
