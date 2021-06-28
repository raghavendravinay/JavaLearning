package strings;

import java.util.Scanner;

/**
 * This program is to print the last occurrence of the given key value from the given sentence
 * @author RaghavendraVinayM
 *
 */
public class FindAKeyWordFromGivenArrayPresentorNot2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		String s[] = new String[5];
		String key = null;
		boolean found = false;
		System.out.println("Enter a 5 word sentence");
		for(int i = 0; i < s.length; i++) {
			s[i] = scanner.next();
		}
		System.out.println("enter a key value to find");
		key = scanner.next();
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals(key)) {
				found = true;
			}
		}
		if(found) {
			System.out.println("the given key value was found.");
		}
		else {
			System.out.println("the given key value was not found");
		}
		scanner.close();
	}
}
