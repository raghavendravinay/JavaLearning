package patterns;

import java.util.Scanner;

/**
 * This program to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle6_UsingMethods {

	public static void main(String []args) {	
														//	ex:num=5
		Scanner scanner = new Scanner(System.in);		//	1
		System.out.println("Enter a Number:");			//	1 2	
		int num = scanner.nextInt();					//	1 2 3
		printPatternTriangle(num);						//	1 2 3 4
		scanner.close();								//  1 2 3 4 5
	}
	public static void printPatternTriangle(int num) {

		for(int i = 1; i <= num; i++) {					
			for(int j = 1; j <= i; j++) {				
				System.out.print(j + " ");
			}
			System.out.println("");	
		}
	}
}
