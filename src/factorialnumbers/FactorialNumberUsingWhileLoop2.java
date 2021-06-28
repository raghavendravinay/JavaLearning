package factorialnumbers;

import java.util.Scanner;

/**
 * This program is to print the factorial of the given number
 * @author RaghavendraVinayM
 *
 */

public class FactorialNumberUsingWhileLoop2 {
	
	public static void main(String []args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		int fact = 1;
		int i = 1;
		while(i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println("factorial of given number is: " + fact);
		scanner.close();
	}
}
