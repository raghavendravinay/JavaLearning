package arrays;

import java.util.Scanner;

public class FindLargeNumbersFromGivenNumbers5 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		int num=sc.nextInt();
		int max=Integer.MIN_VALUE;
		while(num!=-1) {
			num=sc.nextInt();
			if(max<num)
				max=num;
		}
		System.out.println(max);
	}
}
