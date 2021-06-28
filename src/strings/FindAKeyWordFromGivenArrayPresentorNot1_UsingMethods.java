package strings;

import java.util.Scanner;

/**
 * This program is to print the given key value is present in the given sentence or not present
 * @author RaghavendraVinayM
 *
 */
public class FindAKeyWordFromGivenArrayPresentorNot1_UsingMethods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		String s[] = new String[size];
		
		if(findKeyWordFromArray(s)) {
			System.out.println("the given key value was found.");
		}
		else {
			System.out.println("the given key value was not found");
		}
		scanner.close();
	}
	public static boolean findKeyWordFromArray(String s[]) {
		
		Scanner scanner = new Scanner(System.in);
		boolean found = false;
		String key;
		System.out.println("Enter a sentence");
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
		scanner.close();
		return found;
	}
}
