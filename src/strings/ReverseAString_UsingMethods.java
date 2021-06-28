package strings;

import java.util.Scanner;
/**
 * This program is to print the reverse of a string
 * @author RaghavendraVinayM
 *
 */
public class ReverseAString_UsingMethods {

	public static void main(String[] args) {
		
		String original ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string to reverse");
		original = scanner.nextLine();
		stringReverse(original);
		scanner.close();
	}
	public static void stringReverse(String original) {
		String rev = "";
		int len = original.length();
		for(int i = len - 1; i >= 0; i--) {
			rev=rev+original.charAt(i);
		}
		System.out.println("Original String is: " + original);
		System.out.println("reverse of string is: " + rev);
	}
}
