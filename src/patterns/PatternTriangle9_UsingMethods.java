package patterns;

import java.util.Scanner;

/**
 * This program to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle9_UsingMethods {

	public static void main(String[] args) {	
														//	ex:num=5
		Scanner scanner =new Scanner(System.in);		//	5 5 5 5 5
		System.out.println("Enter a number:");			//	4 4 4 4
		int num = scanner.nextInt();					//	3 3 3 
		printPatternTriangle(num);						//  2 2
		scanner.close();								//	1
	}
	public static void printPatternTriangle(int num) {

		for(int i = num; i > 0; i--) {					
			for(int j = 1; j <= i; j++) {				
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}
}
