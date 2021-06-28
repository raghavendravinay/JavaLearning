package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern23_UsingMethods {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");		
		int num = scanner.nextInt();						
		printPyramidPattern(num);
		scanner.close();
	}
	public static void printPyramidPattern(int num) {
		
		for(int i = 1; i <= num; i++) {					
			for(int j = 1; j <= num - i; j++) {			
				System.out.print(" ");				//		ex:5
			}										//			1
			for(int k = 1; k < 2 * i; k++) {		//		   333
				System.out.print((2 * i) - 1);		//		  55555
			}										//		 7777777
			System.out.println("");					//		999999999
		}
	}
}
