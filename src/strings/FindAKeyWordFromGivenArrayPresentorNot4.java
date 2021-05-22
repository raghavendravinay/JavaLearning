package strings;

import java.util.Scanner;

/**
 * This program is to print the given sentence found how many times in the given sentence
 * @author RaghavendraVinayM
 *
 */
public class FindAKeyWordFromGivenArrayPresentorNot4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s[] = new String[5];
		String key = null;
		boolean found = false;
		int k=0;
		System.out.println("Enter a 5 word sentence");
		for(int i=0; i<s.length; i++) {
			s[i] = scanner.next();
		}
		System.out.println("enter a key value to find");
		key=scanner.next();
		for(int i = 0; i<s.length; i++) {
			if(s[i].equals(key)) {
				found = true;
				k++;
			}
		}
		if(found) {
			System.out.println("the given key value was found "+ k +"time(s).");
		}
		else {
			System.out.println("the given key value was not found");
		}
		scanner.close();
	}
}
