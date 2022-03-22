package javaPackage;

import java.util.Scanner;

public class ArmstromgNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
	
		int n=sc.nextInt(); // 1, 153, 370, 371, 407,
		
		int temp=n;
		int r,sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
		}
		if(temp==sum)
			System.out.println("It is a armstrong number");
		else 
			System.out.println("not an armstron number");
	sc.close();
	}
}
