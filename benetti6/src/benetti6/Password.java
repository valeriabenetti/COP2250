package benetti6;

import java.util.*;

public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in password");
		String password = sc.nextLine();
		int uppercase = 0;
		int lowercase = 0;
		int digits = 0;
		for(int i = 0; i < password.length(); i++){ 
			//a for loop going from 0 to the length of the string
			//if the character at the i'th point in the string is between A and Z
			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
				uppercase++; //add one to uppercase
			if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
				lowercase++; //same with lowercase between a and z
			if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
				digits++; //and digits between 0 and 9
			}
		if (uppercase < 2 || lowercase < 2 || digits < 2){ //if uppercase or lowercase or digits are less than 2
			System.out.println("Your password (" + password + ") is invalid because:");
			if (uppercase < 2)
				System.out.println("- fewer than two uppercase letters");
			if (lowercase < 2)
				System.out.println("- fewer than two lowercase letters");
			if (digits < 2)
				System.out.println("- fewer than two digits");
			}else //otherwise
				{
				System.out.println("Your password (" + password + ") is valid."); //the password is valid
				}
		}
}
