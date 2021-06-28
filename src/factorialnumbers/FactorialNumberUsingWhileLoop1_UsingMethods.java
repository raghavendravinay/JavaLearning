package factorialnumbers;

import java.util.Scanner;

/**
 * This program is to print the factorial of the given number
 * @author RaghavendraVinayM
 *
 */

public class FactorialNumberUsingWhileLoop1_UsingMethods {

	public static void main(String []args) {
	
		Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number:");
	int num = scanner.nextInt();
	factorialNumber(num);
	scanner.close();
	}
	public static void factorialNumber(int num) {
	
		int fact = 1;
		while(num > 0) {
			fact = fact * num;
			num--;
		}
		System.out.println("factorial of given number is: " + fact);
		
	}
		
}