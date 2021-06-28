package factorialnumbers;

import java.util.Scanner;

/**
 * This program is to print the factorial of the given number
 * @author RaghavendraVinayM
 *
 */

public class FactorialNumberUsingWhileLoop1 {

	public static void main(String []args) {
	
		Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number:");
	int num = scanner.nextInt();
	int fact = 1;
	while(num > 0) {
		fact = fact * num;
		num--;
	}
	System.out.println("factorial of given number is: " + fact);
	scanner.close();
	}
}