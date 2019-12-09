// Valeria Benetti 2183227
package benetti5;
import java.util.*;

public class nameArray {
	// Create an ArrayList of strings to store the names of celebrities or athletes.
	public static void modify(ArrayList<String> list) {
		// Add five names to the list.
		list.add(2, "Taylor Swift");
		// Pass the list to a void method. Inside the method, Insert another name at index 2 and remove the name at index 4. 
        list.remove(4);
        // Process the list with a for loop and the get() method to display the names, one name per line. 
        System.out.println("Here is the new list");
        for(String name: list) {
        	// Use a foreach loop to display the arraylist again, all names on one line separated by asterisks. 
            System.out.print(" * " + name);
        }
        System.out.println();
    }
	
    public static void main(String[] args) {
    	// After the method call in main, create an iterator for the arraylist and use it to display the list one more time. 
        ArrayList<String> list = new ArrayList<String>();
        list.add("Lionel Messi");
        list.add("Drake");
        list.add("Adele");
        list.add("Dwayne Johnson");
        list.add("Beyonce");
        System.out.println("Here is the list");
        for(int i = 0; i < list.size(); ++i) {
            System.out.println(list.get(i));
        }
        modify(list);
        System.out.println("Using an iterator, here is the list");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
