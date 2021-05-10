package arrays;

import java.util.Scanner;

public class FindLargeNumbersFromGivenNumbers7 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		int num=sc.nextInt();
		int max=Integer.MIN_VALUE;
		for(;num!=-1;) {
			
			if(max<num && num!=-1)
				max=num;
			num=sc.nextInt();
		}
		System.out.println(max);		
	}
}

