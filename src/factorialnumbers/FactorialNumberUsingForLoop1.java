package factorialnumbers;

import java.util.Scanner;

public class FactorialNumberUsingForLoop1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact = i*fact;
		}
		System.out.println("Factorial of"+num+" is:"+fact);
	}
}
