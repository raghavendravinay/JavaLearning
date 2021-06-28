package prime_number;

import java.util.Scanner;

/**
 * This program is to print the given number is not a prime number if we give non-prime numbers
 * @author RaghavendraVinayM
 *
 */

public class PrimeNumber1 {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");   // Prime Numbers: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23....
		int num = scanner.nextInt();
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println(num + " is not a prime"); // Print numbers which are only not prime numbers
				break;
			}
		}
		scanner.close();
	}
	public static void nonPrimeNumber(int num) {
		
	}
}
