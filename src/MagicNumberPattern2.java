import java.util.Scanner;

/**
 * This program is to find the given number is magic number or not.
 * @author RaghavendraVinayM
 *
 */

public class MagicNumberPattern2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number"); 
		int num = scanner.nextInt();  // ex: num = 325;
		
		if(isMagicNumber(num)) {
			System.out.println(num + " is a Magic Number");
		}
		else {
			System.out.println(num + " is not a Magic Number");
		}
		
		scanner.close();
	}
	
	public static boolean isMagicNumber(int num) {
		int rem, magic = 0;
		
		while(num > 9) {
			while(num > 0) {
				rem = num % 10;
				magic = magic + rem;
				num = num / 10;
			}
			num = magic;
			magic = 0;
		}
		
		if(num == 1) {
			return true;
		}
		else {
			return false;
		}
	}
}
