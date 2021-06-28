package prime_number;

import java.util.Scanner;

/**
 * This program is to find the given number is prime or not
 * @author RaghavendraVinayM
 *
 */

public class PrimeNumber4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scanner.nextInt();	// Prime Numbers: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23....
		boolean isPrime = false;
		if(num % 2 == 0) 
		{
			isPrime = true;
		}
		else
		{
			for(int i = 3; i <= num / 2; i += 2) 
			{
				if(num % i == 0) 
				{
					isPrime = true;
					break;
				}
			}
		}
		if(isPrime && num != 2) {
			System.out.println(num + " is not a prime number");
		}
		else {
			System.out.println(num + " is a prime number");
		}
		scanner.close();
	}
}
