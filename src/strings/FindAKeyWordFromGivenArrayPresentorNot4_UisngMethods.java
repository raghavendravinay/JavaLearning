package strings;

import java.util.Scanner;

/**
 * This program is to print the given sentence found how many times in the given sentence
 * @author RaghavendraVinayM
 *
 */
public class FindAKeyWordFromGivenArrayPresentorNot4_UisngMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s[] = new String[5];
		String key = null;
		int k = 0;
		System.out.println("Enter a 5 word sentence");
		enterValuesIntoArray(s);
		System.out.println("enter a key value to find");
		key=scanner.next();
		
		if(isFound(s, key)) {
			System.out.println("the given key value was found ");
		}
		else {
			System.out.println("the given key value was not found");
		}
		scanner.close();
	}
	public static void enterValuesIntoArray(String s[]) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < s.length; i++) {
			s[i] = scanner.next();
		}
	}
	public static boolean isFound(String s[], String key) {
		
		boolean found = false;
		int k =0;
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals(key)) {
				found = true;
				k++;
				}
		}
		System.out.println("value present in the given sentence " + k + " time(s).");
		return found;
	}
}
