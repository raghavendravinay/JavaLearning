package factorialnumbers;

import java.util.Scanner;

/**
 * This program is to print the factorial of the given number
 * @author RaghavendraVinayM
 *
 */

public class FactorialNumberUsingForLoop2_UsingMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		long num = scanner.nextInt();
		factorialNumber(num);
		scanner.close();
	}
	public static void factorialNumber(long num) {

		long fact = 1;
		for(long i = num; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is: " + fact);
	}
}
