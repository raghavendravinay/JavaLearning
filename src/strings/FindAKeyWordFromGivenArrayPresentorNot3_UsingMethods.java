package strings;

import java.util.Scanner;

/**
 * This program is to print the given key value, found at which position
 * @author RaghavendraVinayM
 *
 */

public class FindAKeyWordFromGivenArrayPresentorNot3_UsingMethods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s[] = new String[5];
		String key = null;
		enterValuesIntoArray(s);
		System.out.println("enter a key value to find");
		key = scanner.next();
		
		if(isFound(s, key)) {
			System.out.println("the given key value is found");
		}
		else {
			System.out.println("the given key value is not found");
		}
		scanner.close();
	}
	public static void enterValuesIntoArray(String s[]) {
	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a 5 word sentence");
		for(int i = 0; i < s.length; i++) {
			s[i] = scanner.next();
		}
	}
	public static boolean isFound(String s[], String key) {
		
		int num;
		boolean found = false;
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals(key)) {
				num = i;
				System.out.println("position of the number is " + num);
				found = true;
				break;
			}
		}
		return found;
	}
}
