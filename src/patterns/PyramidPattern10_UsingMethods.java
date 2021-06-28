package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern10_UsingMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);		//		ex:num=5
		System.out.println("Enter a number:");			//	*
		int num = scanner.nextInt();					//	* *
		printPyramidPattern(num);						//  * * *
														//	* *
		scanner.close();								// 	*
	}
	public static void printPyramidPattern(int num) {

		for(int i = 1; i <= (num + 1) / 2; i++) {		
			for(int j = 1; j <= i; j++) {				
				System.out.print("* ");									
			}											
			System.out.println("");						
		}															 
		for(int k = num / 2; k > 0; k--) {			 
			for(int l = 1; l <= k; l++) {				 
				System.out.print("* ");									
			}												
			System.out.println("");
		}
	}
}