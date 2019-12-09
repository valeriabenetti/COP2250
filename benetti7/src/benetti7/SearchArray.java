// Valeria Benetti 2183227
package benetti7;

public class SearchArray {
	public static void main(String[] args) {
	       try{
	       // create the list of the hay stack   
	       int[] haystack = {2,4,6,8,10,12,14,16,18,20};
	       
	       // add the needle
	       int needle = 8;
	       System.out.println(returnIndex(haystack, needle));
	       
	       // add a second needle that'll throw the exception message
	       needle =11;
	       System.out.println(returnIndex(haystack, needle));
	       }
	       catch(Exception e){
	           System.out.println(e.getMessage());
	       }
	      
	   }
		// call for hay stack and needle and exception
	   public static int returnIndex(int[ ] haystack, int needle) throws Exception {
	       for(int i=0; i<haystack.length; i++){
	           if(haystack[i] == needle){
	               return i;
	           }
	       }
	       // Throw the exception for the element that is missing
	       throw new Exception("Element not found in array");
	   }
}
