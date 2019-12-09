// Valeria Benetti 2183227
package benetti7;


// Write a program that generates 10 random doubles, all between 1 and 11, and writes them to a text file, one number per line. 
// Then write another program that reads the text file and displays all the doubles and their sum accurate to two decimal places.

import java.io.*;
import java.util.*;


public class WriteTenRandom {
	public static void main(String[] args) throws FileNotFoundException {
		// create a file that will save the numbers
		File file = new File("doubleFile");
	    PrintWriter pw = new PrintWriter(file);
	    // starting number
	    double start = 1;
	    // ending number
	    double end = 11;
	    Random random = new Random();
	    
	    // Start creating the random numbers
	    for(int i=0; i<10; i++){
	    	double randNum = start + (random.nextDouble() * (end - start));
	        pw.write(randNum+"\n");
	       }
	       System.out.println("File has been geenrated");
	      
	       pw.flush();
	       pw.close();
	      
	   }
}
