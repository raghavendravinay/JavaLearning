package javaPackage;

import java.util.Scanner;

public class FibonacciDemo2 {

	public static void main(String[] args) {
		int k, a=1, b=1;
		Scanner sc = new Scanner(System.in);
		k=0;
		System.out.println("Enter a value");
		int n=sc.nextInt();
		System.out.print("1 1 ");
		while(k<=n) {
			k=a+b;
			System.out.print(k+" ");
			a=b;
			b=k;
		}
		sc.close();
	}
}
