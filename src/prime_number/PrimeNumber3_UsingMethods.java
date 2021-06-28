package prime_number;

import java.util.Scanner;

/**
 * This program is to find the given number is prime or not
 * @author RaghavendraVinayM
 *
 */

public class PrimeNumber3_UsingMethods {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();  // Prime Numbers: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23....
		boolean isPrime = false;
		
		if(primeNumber(num, isPrime)) {
			System.out.println(num + "  is not a prime number"); //Prints given number is prime or not
		}
		else {
			System.out.println(num + " is a prime number");
		}
		scanner.close();
	}
	public static boolean primeNumber(int num, boolean isPrime) {

		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				isPrime = true;
				break;
			}
		}
		return isPrime;
	}
}
