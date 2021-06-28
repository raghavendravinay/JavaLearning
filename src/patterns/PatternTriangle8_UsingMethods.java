package patterns;

import java.util.Scanner;

/**
 * This program to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle8_UsingMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);		//	ex:num=5
		System.out.println("Enter a number:");			//	1 2 3 4 5
		int num = scanner.nextInt();					//	1 2 3 4
		printPatternTriangle(num);						//  1 2 3
														//	1 2
		scanner.close();								//	1
	}
	public static void printPatternTriangle(int num) {

		for(int i = 1; i <= num; i++) {					
			for(int j = 1; j <= num + 1 - i; j++) {		
				System.out.print(j + " ");				
			}
			System.out.println(" ");
		}
	}
}
