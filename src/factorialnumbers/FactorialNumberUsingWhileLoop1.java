package factorialnumbers;

import java.util.Scanner;

public class FactorialNumberUsingWhileLoop1 {

	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int fact=1;
	while(num>0) {
		fact=fact*num;
		num--;
	}
	System.out.println("factorial of given number is:"+fact);
	}
}