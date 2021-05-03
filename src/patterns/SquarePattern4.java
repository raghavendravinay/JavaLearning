package patterns;

import java.util.Scanner;

public class SquarePattern4 {

	public static void main(String[] args) {		//ex:num=5
		Scanner sc=new Scanner(System.in);			//	5 5 5 5 5
		System.out.println("Enter a number:");		//	4 4 4 4 4
		int num=sc.nextInt();						//  3 3 3 3 3
		for(int i=num; i>0; i--) {					//	2 2 2 2 2
			for(int j=1; j<=num; j++) {				//	1 1 1 1 1
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}
