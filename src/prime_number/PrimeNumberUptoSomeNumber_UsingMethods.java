package prime_number;

import java.util.Scanner;

/**
 * This program is to print the prime numbers from one number to another which given by users
 * @author RaghavendraVinayM
 *
 */

public class PrimeNumberUptoSomeNumber_UsingMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ending number"); //ex: 100
		int num = scanner.nextInt();
		primeNumber(num);
		scanner.close();
	}
	public static void primeNumber(int num) {

		for(int i = 0; i <= num; i++) {
			boolean isPrime = true;
			if(i % 2 != 0) {
				isPrime = false;
				for(int j = 3; j <= i / 2; j += 2) {
					if(i % j == 0) {
						isPrime = true;
						break;
					}
				}
			}
			if(!isPrime || i == 2) {
				System.out.print(i + " ");
			}
		}
	}
		
}
