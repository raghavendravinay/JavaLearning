package prime_number;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");   // Prime Numbers: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23....
		int num=sc.nextInt();
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				System.out.println(num+" is not a prime"); // Print numbers which are only not prime numbers
				break;
			}
		}
		
	}
}
