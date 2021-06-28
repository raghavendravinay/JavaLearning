package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern6_UsingMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number:");		
		int num = scanner.nextInt();						
		printPyramidPattern(num);
		scanner.close();
	}
	public static void printPyramidPattern(int num) {
		
		for(int i = 1; i <= num; i++) {					//		ex:5
			for(int j = 1; j <= num - i; j++) {			//			0
				System.out.print(" ");					//		   101
														//		  21012
			}											//		 3210123
			for(int k = (2 * i) - 1; k > 0; k--) {		//		432101234
				System.out.print(Math.abs(k - i));
			}
			System.out.println("");
		}
	}
}
