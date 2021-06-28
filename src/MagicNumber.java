import java.util.Scanner;

/**
 * This program is to find the given number is a magic number or not
 * @author RaghavendraVinayM
 *
 */

public class MagicNumber {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt(); // Ex: num = 325;
		
		if(isMagicNumber(num)) {
			System.out.println(num + " is a Magic Number");
		}
		else {
			System.out.println(num + " is not a Magic Number");
		}
		scanner.close();
	}
	
	public static boolean isMagicNumber(int num) {
		int rem, mag = 0;
		
		while(num > 0) {
			rem = num % 10;
			mag = mag + rem;
			num = num / 10;
			if(num == 0 && mag > 9) {
				num = mag;
				mag = 0;
			}
			
		}
		if(mag == 1) {
			return true;
		}
		else {
			return false;
		}
	}
}
