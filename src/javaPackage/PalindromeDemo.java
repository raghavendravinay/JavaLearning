package javaPackage;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
	
		int n, r,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		int t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			s=(10*s)+r;
		}
		if(t==s)
			System.out.println(t+" is a palindrome");
		else
			System.out.println(t +" is not a palindrome");
		sc.close();
	}
}
