// Valeria Benetti 2183227
package benetti5;
import java.util.*;
//Declare an array to hold eight integers. 
public class arrayEight {
	public static int[] sort(int arr[]) {
		// Use a for loop to add eight random integers, all in the range from 50 to 100, inclusive, to this array. 
        for(int i = 0; i < arr.length-1; ++i) {
            for(int j = 0; j < arr.length-1; ++j) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[8];
        // Use a for loop to add eight random integers, all in the range from 50 to 100, inclusive, to this array. 
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = 50 + random.nextInt(51);
        }
        arr = sort(arr);
        int evens = 0, odds = 0, total = 0;
        // Print these two values in main. 
       // Next, pass the array to a method that sorts the array and returns another array containing only the largest and smallest elements in the original array. 
        System.out.println("The lowest element is " + arr[0]);
        System.out.println("The highest element is " + arr[arr.length-1]);
        System.out.print("Here is the array ");
        // Then use a for each loop to display all elements of the sorted array on one line separated by a single space. 
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
            if(arr[i] % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
            total += arr[i];
        }
     // This latter loop should also count the odd and even numbers in the array and determine the sum of all elements in the array.
        System.out.println("\nEvens: " + evens + ", odds: " + odds);
        System.out.println("Total: " + total);
    }
}
