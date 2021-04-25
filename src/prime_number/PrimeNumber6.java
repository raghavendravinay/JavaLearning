package prime_number;

import java.util.Scanner;

public class PrimeNumber6 {

	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num= sc.nextInt();
		boolean isPrime=true;
		if(num%2!=0) {
			isPrime=false;
			for(int i=3; i<=num/2; i++) {
				if(num%i==0) {
					isPrime=true;
					break;
				}
			}
		}
		if(isPrime&&num!=2) {
			System.out.println(num+" is not a prime number");
		}
		else {
			System.out.println(num+" is a prime number");
		}
	}
}
