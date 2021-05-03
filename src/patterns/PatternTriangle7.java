package patterns;

import java.util.Scanner;

public class PatternTriangle7 {

	public static void main(String[] args) {	//	ex:5
		Scanner sc=new Scanner(System.in);		//	1 1 1 1 1
		System.out.println("Enter a Number:");	//	2 2 2 2
		int num=sc.nextInt();					//  3 3 3 
		for(int i=1; i<=num; i++) {				//	4 4
			for(int j=1; j<=num+1-i; j++) {		//	5
				System.out.print(i+" ");
			}
			System.out.println("");	
		}
	}
}
