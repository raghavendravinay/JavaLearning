package prime_number;

import java.util.Scanner;

/**
 * This program is to print the given number whether the it is a prime number or not
 * @author RaghavendraVinayM
 *
 */

public class PrimeNumber {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt(); // Prime Numbers: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23....
		boolean isPrime = false;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				isPrime = true;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num + " is not a prime number");
		}
		else {
			System.out.println(num + " is a prime number");
		}
		scanner.close();
	}
}
