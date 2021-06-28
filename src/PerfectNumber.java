import java.util.Scanner;

/**
 * This program is to find the given number is a perfect number or not.
 * @author RaghavendraVinayM
 *
 */

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");	// Ex: num = 28
		int num = scanner.nextInt();
		
		if(num == isStaticNumber(num)) {
			System.out.println(num + " is a perfect number");
		}
		else {
			System.out.println(num + " is not a perfect number");
		}
		scanner.close();
	}
	
	public static int isStaticNumber(int num) {
		
		int add = 0;
		for(int i = 1; i <= num / 2; i++) {
			if(num % i == 0) {
				add = add + i;
			}
		}
		return add;
	}
}
