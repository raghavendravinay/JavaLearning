package patterns;

import java.util.Scanner;

public class PatternTriangle6 {

	public static void main(String []args) {	//	ex:num=5
		Scanner sc=new Scanner(System.in);		//	1
		System.out.println("Enter a Number:");	//	1 2	
		int num=sc.nextInt();					//	1 2 3
		for(int i=1; i<=num; i++) {				//	1 2 3 4
			for(int j=1; j<=i; j++) {			//  1 2 3 4 5
				System.out.print(j+" ");
			}
			System.out.println("");
			
		}
	}
}
