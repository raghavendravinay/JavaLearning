package patterns;

import java.util.Scanner;

public class PatternTriangle1 {

	public static void main(String[] args) {		//	ex: num=5
		Scanner sc=new Scanner(System.in);			//	*
		System.out.println("Enter a number:");		//  * *
		int num=sc.nextInt();						//	* * *
		for(int i=1; i<=num; i++) {					//	* * * *
			for(int j=1; j<=i; j++) {				//	* * * * *
				System.out.print("* ");				
			}
			System.out.println("");
		}
	}
}
