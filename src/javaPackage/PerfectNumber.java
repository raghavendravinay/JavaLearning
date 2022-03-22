package javaPackage;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//6 or 28 or 496 or 8128
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean b= isPerfect(n);
		if(b)
			System.out.println("It is a perfect number");
		else
			System.out.println("It is not");
		sc.close();
	}
	public static boolean isPerfect(int n) {
		int temp=0;
		for(int i=1; i<=n/2; i++)
		{
			if (n%i==0)
				temp+=i; //temp=temp+i;
		}
		if(n==temp)
			return true;
		
		return false;
	}
}
