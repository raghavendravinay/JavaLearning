package arrays;

import java.util.Scanner;

public class FindLargeNumbersFromGivenNumbers6 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		int max=Integer.MIN_VALUE;
		int num;
		do{
			 num=sc.nextInt();
			if(max<num)
				max=num;
		}while(num!=-1);
		System.out.println(max);
	}
}
