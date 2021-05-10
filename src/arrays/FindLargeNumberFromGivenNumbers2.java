package arrays;

import java.util.Scanner;

public class FindLargeNumberFromGivenNumbers2 {

	public static void main(String[] args) {
		
		approach1();
		
	}
	
	public static void approach1() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		int max=Integer.MIN_VALUE;
		for(; ;) {
			int num=sc.nextInt();
			if(num==-1) {
				break;
			}
			if(max<num) {
				max=num;
			}
		}
		System.out.println(max);
	}
	
	public static void approach2() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		int max=Integer.MIN_VALUE;
		do {
			int num=sc.nextInt();
			if(num==-1) {
				break;
			}
			if(max<num) {
				max=num;
			}
		}while(true);
		System.out.println(max);
	}
}
