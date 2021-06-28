package factorialnumbers;

import java.util.Scanner;

/**
 * This program is to print the factorial of the given number
 * @author RaghavendraVinayM
 *
 */

public class FactorialNumberUsingForLoop_UsingMethods {

	public static void main(String []args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number:");
	long num = scanner.nextInt();
	factorialNumber(num);
	scanner.close();
}
	public static void factorialNumber(long num) {
	
	long fact = 1;
	for(long i = 1; i <= num; i++) {
		fact = i * fact;
	}
	System.out.println("Factorial of " + num + " is: " + fact);
	}
}
