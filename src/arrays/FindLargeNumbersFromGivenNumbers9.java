package arrays;

import java.util.Scanner;

public class FindLargeNumbersFromGivenNumbers9 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		int max=Integer.MIN_VALUE;
		int num=sc.nextInt();
		do{
			
			if(max<num && num!=-1)
				max=num;
			num=sc.nextInt();
		}while(num!=-1);
		System.out.println(max);
	}
}

