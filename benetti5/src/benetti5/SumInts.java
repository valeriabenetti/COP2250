// Valeria Benetti 2183227
package benetti5;

import java.util.*;

public class SumInts {
	// Write a method named sumInts that can take a variable number of int arguments (see page 264-265) and return the sum of these arguments.
	public static void main(String[] args) 
	{
		// The ints to be summed up must be entered as command line arguments.
		System.out.print("Passing [");
		for(int i=0;i<args.length;i++) 
		{
			if(args.length-1==i)
				System.out.print(args[i]);
			else
				System.out.print(args[i]+", ");
		}
		int sum = sumInts(args);
		System.out.print("] Sum is "+ sum);
	}
	// In the main method, display the ints that were entered on the command line.	
	public static int sumInts(String num[]) {
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			sum+=Integer.parseInt(num[i]);
		}
		return sum;
	}
}
