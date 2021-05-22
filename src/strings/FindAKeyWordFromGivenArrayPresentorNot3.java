package strings;

import java.util.Scanner;
/**
 * This program is to print the given key value, found at which position
 * @author RaghavendraVinayM
 *
 */
public class FindAKeyWordFromGivenArrayPresentorNot3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s[] = new String[5];
		String key = null;
		boolean found = false;
		int num=0;
		System.out.println("Enter a 5 word sentence");
		for(int i=0; i<s.length; i++) {
			s[i] = scanner.next();
		}
		System.out.println("enter a key value to find");
		key=scanner.next();
		for(int i = 0; i<s.length; i++) {
			if(s[i].equals(key)) {
				num= i;
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("the given key value was found at position "+(num+1));
		}
		else {
			System.out.println("the given key value was not found");
		}
	}
}
