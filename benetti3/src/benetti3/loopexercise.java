// Valeria Benetti 2183227
package benetti3;

import java.util.*;

public class loopexercise {
	public static void main(String[] args) {
	   int sum = 300; // Initial sum count of 300
	   int m=0;//to store the multiples
	   int s=0;//to store their sum
	   while (sum >= 200 ) {
		   if((sum % 11 == 0) &&(sum%13!=0))//Is divisible by 11 but not 13
			   {
			   System.out.print(sum+" ");
			   m++;
			   s+=sum;
			   if(m%5==0)System.out.println();
			   }
		   if((sum % 13 == 0) &&(sum%11!=0))////Is divisible by 13 but not 11
			   { 
			   System.out.print(sum+" ");
			   m++;
			   s+=sum;
			   if(m%5==0)System.out.println(); // Print out 5 per line
			   }
		   sum = sum - 1;
		   }
	   System.out.println("Number of integers found: "+m+"\nSum of integers : "+s);
	   }	
}
