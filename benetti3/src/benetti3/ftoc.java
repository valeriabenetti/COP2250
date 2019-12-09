//Valeria Benetti 2193227
package benetti3;

// Write a program that generates a two-column table showing Fahrenheit temperatures 
//from -40F to 120F and their equivalent Celsius temperatures. 
//Each line in the table should be 5 degrees F more than the previous one. 
//Both the Fahrenheit and Celsius temperatures should be accurate to 1 decimal place.

// (C * 1.8) + 32 = F
// (F - 32) / 1.8 = C

public class ftoc {
	public static void main(String[] args) {
		
		double celsiusTemp;
		
		// Create the Header for the table
		System.out.print("Fahrenheit Temperature \tCelsius Temperature\n-----------------------\t---------------------\n");
		
		// Create the range to convert Fahrenheit to Celsius
		for( double fahrenheitTemp = -40; fahrenheitTemp <= 120; fahrenheitTemp++ ) {
			
			// (F - 32) / 1.8 = C <--- Formula 
			celsiusTemp = ((fahrenheitTemp - 32) / 1.8);
			
			// Print out the conversions and have them line up with the headers
			System.out.printf("\t%.1f\t\t\t%.1f\n", fahrenheitTemp, celsiusTemp);
		}
	}
}
