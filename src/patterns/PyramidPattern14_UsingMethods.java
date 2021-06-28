package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern14_UsingMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		printPyramidPattern(num);
		scanner.close();
	}
	public static void printPyramidPattern(int num) {
		for(int i = num; i >= 0; i--) {
			for(int j = i - 1; j >= 0; j--) {
				System.out.print(" ");
			}
			for(int k = num; k >= i; k--) {			//	ex: num=3
				System.out.print(k);				//			3
			}										//		   32
			System.out.println("");					//		  321
		}											//		 3210
		for(int l = 0; l <= num; l++) {				//		  321
			for(int m = l; m >= 0; m--) {			//		   32
				System.out.print(" ");				//			3
			}
			for(int n = num; n > l; n--) {
				System.out.print(n);
			}
			System.out.println("");
		}	
	}
}
