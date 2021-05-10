package arrays;

import java.util.Scanner;

public class FindLargeNumberFromGivenNumbers3 {

	public static void main(String[] args) {
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
