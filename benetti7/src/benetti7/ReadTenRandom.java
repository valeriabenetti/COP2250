// Valeria Benetti 2183227
package benetti7;

import java.io.*;
import java.util.*;

public class ReadTenRandom {
	public static void main(String[] args) throws FileNotFoundException {
		// open the file and start reading the integers
		File file = new File("doubleFile");
	    Scanner scan = new Scanner(file);
        double sum = 0;
        while(scan.hasNextDouble()){
        	
        	double value = scan.nextDouble();
        	System.out.println(value);
        	// total all of the values together
        	sum = sum + value;
        	}
        // Print out the total of all the values in the list
        System.out.println("The total is "+sum);
        scan.close();
	   }
}
