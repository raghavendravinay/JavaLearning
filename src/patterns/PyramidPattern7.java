package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);			
		System.out.println("Enter a number:");		
		int num = scanner.nextInt();						
		for(int i = num; i > 0; i--) {					//	ex:num=5
			for(int j = 1; j <= num - i; j++) {			//		*********
				System.out.print(" ");					//		 *******
			}											//		  *****
			for(int k = 1; k < 2 * i; k++) {			//		   ***
				System.out.print("*");					//			*
			}
		System.out.println("");	
		}
		scanner.close();
	}
}
