package strings;
import java.util.Scanner;
/**
 * This program to verify whether the given string is a palindrome or not
 * @author RaghavendraVinayM
 *
 */
public class StringPalindrome_UsingMethods {

	public static void main(String[] args) {
		
		String original = null;
		System.out.println("Enter String to reverese");
		Scanner scanner = new Scanner(System.in);
		original = scanner.next();
		
		if(original.equalsIgnoreCase(stringReverse(original)))
		System.out.println("Given String is a palindrome");
		else 
			System.out.println("Given String is not a palindrome");
		scanner.close();
	}
	public static String stringReverse(String original) {
		
		String rev = "";
		int len = original.length();
		for(int i = len-1 ; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}
		return rev;
	}
}
