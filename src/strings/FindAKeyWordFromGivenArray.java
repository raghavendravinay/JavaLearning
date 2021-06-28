package strings;
import java.util.Scanner;

/**
 * This program is to print, whether the given key value is present in the given sentence
 * @author RaghavendraVinayM
 *
 */

public class FindAKeyWordFromGivenArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		String[] s = new String[size];
		System.out.println("Enter a  sentence");
		for(int i = 0; i < s.length; i++) {
			s[i] = scanner.next();
		}
		System.out.println("Enter a key word");
		String key = scanner.next();
		for(int i = 0; i < s.length; i++) {
			if(key.equals(s[i])) 
			{
				System.out.println(key + " is found in the given sentence");
			}
		}
		scanner.close();
	}
}
