package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern15_UsingMethods {

	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scanner.nextInt();
		printPyramidPattern(num);
		scanner.close();
	}
	public static void printPyramidPattern(int num) {

		for(int i = 1; i <= num; i++) {					//		Ex: num=5
			for(int j = 1; j <= num - i; j++) {			//			*
				System.out.print(" ");					//		   * *	
			}											//		  * * *
			for(int k = 1; k <= i; k++) {				//		 * * * *
				System.out.print("* ");					//		* * * * *
			}
			System.out.println("");
		}
	}
}
