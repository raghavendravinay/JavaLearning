package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern2_UsingMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");	
		int num = scanner.nextInt();					
		printPyramidPattern(num);
		scanner.close();
	}
	public static void printPyramidPattern(int num) {
												//	ex:num=5
		for(int i = 1; i <= num; i++) {			//			1						
			for(int j = 1; j <= num - i; j++) {	//		   222		
				System.out.print(" ");			//		  33333		
			}									//		 4444444		
			for(int k = 1; k < 2 * i; k++) {	//		555555555
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
}
