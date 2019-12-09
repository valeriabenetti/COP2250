package benetti1and2;
//Valeria Benetti - 2183227
import java.util.Scanner;
public class exercise3 {
	public static void main(String[] args) {
		// adding the ability to input a value
		 Scanner input = new Scanner(System.in);
		 // Asking user to input the kilogram
		 System.out.println("Enter the Kilogram:");
		 // saving that input as a variable
		 double kilo = input.nextDouble();
		 // converting the kilogram variable into pound
		 double pound = kilo * 2.20462262;
		 //Printing the converted pounds
		 System.out.println("Pounds: " + pound); 
		 }
}
