package arrays;

import java.util.Scanner;

public class FindLargeNumberFromGivenNumbers2 {

	public static void main(String[] args) {
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
}
