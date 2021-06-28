package patterns;

import java.util.Scanner;

/**
 * This program to print the Square pattern
 * @author RaghavendraVinayM
 *
 */

public class SquarePattern1_UsingMethods {

	public static void main(String []args) {		

		Scanner scanner = new Scanner(System.in);			
		System.out.println("Enter a number:");		
		int num = scanner.nextInt();				
		printPyramidPattern(num);
		scanner.close();
	}
	public static void printPyramidPattern(int num) {

		for(int i = 1; i <= num; i++) {				//	ex:num=5
			//	* * * * *
			for(int j = 1; j <= num; j++) {			//	* * * * *
				System.out.print("* ");				//	* * * * *
			}										//	* * * * *
			System.out.println("");					//	* * * * *
		}
	}
}
