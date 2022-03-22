package javaPackage;

import java.util.Scanner;

public class SwapDemoEasyWay {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one number:");
		int a =sc.nextInt();
		System.out.println("a value before swapping is "+ a);
		System.out.println("Enter other number:");
		int b =sc.nextInt();
		System.out.println("b value before swapping is "+ b);
		
		//b=a -> both the values will be same
		
		b=a+b-(a=b); //a=b so a value will be 6 then 6 will be removed from 6 then b = 5
		// preserves b in a
		System.out.println("a value after swapping is "+ a);
		System.out.println("b value after swapping is "+ b);
		sc.close();
	}
}
