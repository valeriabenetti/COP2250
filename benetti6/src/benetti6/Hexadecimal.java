package benetti6;

import java.util.*;

public class Hexadecimal {
	public static void main(String s[]){
		System.out.println("Enter the Hexadecimal");
		Scanner ss=new Scanner(System.in);
		String str=ss.nextLine();
		int base10=Integer.parseInt(str,16);
		System.out.println("Base10: "+base10);
		String binary=Integer.toBinaryString(base10);
		System.out.println("Binary: "+binary);
		base10=Integer.parseInt(binary,2);
		System.out.println("Base10: "+base10);
	}
}
