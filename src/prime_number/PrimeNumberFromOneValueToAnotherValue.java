package prime_number;

import java.util.Scanner;

public class PrimeNumberFromOneValueToAnotherValue {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number"); // ex: 1
		int n1=sc.nextInt();
		System.out.println("Enter ending number"); //ex: 100
		int n2=sc.nextInt();
		

		for(int i=n1; i<=n2; i++) 
		{
			boolean isPrime=true;
			if(i%2!=0) {
				isPrime=false;
				for(int j=3;j<=i/2; j+=2) {
					if(i%j==0) {
						isPrime=true;
						break;
					}
				}
			}
			if(!isPrime || i==2) {
				System.out.print
				(i+" ");
			}
		}
	}

}
