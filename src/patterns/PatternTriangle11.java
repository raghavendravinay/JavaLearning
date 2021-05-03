package patterns;

import java.util.Scanner;

public class PatternTriangle11 {

	public static void main(String []args) {	//	ex: num=5
		Scanner sc=new Scanner(System.in);		//			1
		System.out.println("Enter a Number:");	//		   22
		int num=sc.nextInt();					//		  333
		for(int i=1; i<=num; i++) {				//		 4444
			for(int j=1; j<=num-i; j++) {		//		55555
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
		
	}
}
