package patterns;

import java.util.Scanner;

/**
 * This program to print the Square pattern
 * @author RaghavendraVinayM
 *
 */

public class SquarePattern4_UsingMethods {

	public static void main(String[] args) {		
		
		Scanner scanner = new Scanner(System.in);			
		System.out.println("Enter a number:");		
		int num = scanner.nextInt();
		printPyramidPattern(num);
		scanner.close();
	}
	public static void printPyramidPattern(int num) {

		for(int i = num; i > 0; i--) {			//ex:num=5		
			for(int j = 1; j <= num; j++) {		//	5 5 5 5 5
				System.out.print(i + " ");		//	4 4 4 4 4
			}									//  3 3 3 3 3
			System.out.println("");				//	2 2 2 2 2
		}										//	1 1 1 1 1
	}
}
