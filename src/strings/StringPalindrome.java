package strings;
import java.util.Scanner;
/**
 * This program to verify whether the given string is a palindrome or not
 * @author RaghavendraVinayM
 *
 */
public class StringPalindrome {

	public static void main(String[] args) {
		
		String original = null;
		String rev = "";
		System.out.println("Enter String to reverese");
		Scanner scanner = new Scanner(System.in);
		original = scanner.next();
		int len = original.length();
		for(int i = len-1 ; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}
		System.out.println(rev);
		if(original.equalsIgnoreCase(rev))
		System.out.println("Given String is a palindrome");
		else 
			System.out.println("Given String is not a palindrome");
		scanner.close();
	}
}
