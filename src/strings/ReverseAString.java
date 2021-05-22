package strings;

import java.util.Scanner;
/**
 * This program is to print the reverse of a string
 * @author RaghavendraVinayM
 *
 */
public class ReverseAString {

	public static void main(String[] args) {
		String original ;
		String rev="";
		System.out.println("Enter string to reverse");
		Scanner sc = new Scanner(System.in);
		original =sc.nextLine();
		int len=original.length();
		for(int i= len-1; i>=0; i--) {
			rev=rev+original.charAt(i);
		}
		System.out.println("Original String is: "+original);
		System.out.println("reverse of string is: "+rev);
	}
}
