package prime_number;

import java.util.Scanner;

/**
 * This program is to find the given number is prime or not
 * @author RaghavendraVinayM
 *
 */

public class PrimeNumber5_UsingMethods 
{

	public static void main(String []args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();// Prime Numbers: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23....
		boolean isPrime = true;
		
		if(primeNumber(num, isPrime) && num != 2) 
		{
			System.out.println(num + " is not a prime number");
		}
		else {
			System.out.println(num + " is a prime number");
		}
		scanner.close();
	}
	public static boolean primeNumber(int num, boolean isPrime) {
		
		if(num % 2 != 0) 
		{
			isPrime = false;
			for(int i = 3; i <= num / 2; i += 2) 
			{
				if(num %i == 0) 
				{
					isPrime = true;
					break;
				}
			}
		}
		
		return isPrime;
	}
}
