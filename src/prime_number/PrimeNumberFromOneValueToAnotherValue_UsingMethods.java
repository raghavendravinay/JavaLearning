package prime_number;

import java.util.Scanner;

/**
 * This program is to print the prime numbers from one number to another which given by users
 * @author RaghavendraVinayM
 *
 */

public class PrimeNumberFromOneValueToAnotherValue_UsingMethods {
	public static void main(String []args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting number"); // ex: 1
		int n1 = scanner.nextInt();
		System.out.println("Enter ending number"); //ex: 100
		int n2 = scanner.nextInt();
		primeNumber(n1, n2);		
		scanner.close();
	}

	public static void primeNumber(int n1, int n2) {

		for(int i = n1; i <= n2; i++) 
		{
			boolean isPrime = true;
			if(i %2 != 0) {
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
