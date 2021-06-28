package prime_number;

import java.util.Scanner;

/**
 * This program is to find the given number is prime
 * @author RaghavendraVinayM
 *
 */

public class FirstNPrimeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value to print prime numbers upto which value:");
		int num = scanner.nextInt();
		int n = 1;
		while(num > 0) {
			boolean isPrime = true;
			if(n % 2 != 0) {
				isPrime = false;
				for(int i = 3; i <= n / 2; i += 2) {
					if(n % i == 0) {
						isPrime = true;
						break;
					}
				}
			}
			if(!isPrime || n == 2) {
				System.out.print(n + " ");
				num--;
			}
			n++;
		}
		scanner.close();
	}
}
