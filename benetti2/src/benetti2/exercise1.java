package benetti2;
import java.util.Scanner;
//Valeria Benetti - 2183227
public class exercise1 {
	public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter a first name, middle name, and surname:");
        String first_name = user_input.next(); 
        String second_name = user_input.next();
        String surname = user_input.next();
        System.out.println("Length of your name: " + first_name.length() + second_name.length() + surname.length() + " characters");
        System.out.println("Length of your middle name: " + second_name.length() + " characters");
        System.out.println("Your initials are " + first_name.charAt(0)+ second_name.charAt(0)+ surname.charAt(0));
        System.out.println(first_name + " "+ second_name + " " + surname);

	 }
}
