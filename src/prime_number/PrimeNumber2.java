package prime_number;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		boolean isPrime=false;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				isPrime=true;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+" is not a palindrome");
		}
		else {
			System.out.println(num +" is a prime number");
		}
	}
}
