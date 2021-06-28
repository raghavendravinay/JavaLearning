package patterns;

import java.util.Scanner;

/**
 * This program is to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle11_UsingMethods {

	public static void main(String []args) {			//	ex: num=5
		Scanner scanner = new Scanner(System.in);		//			1
		System.out.println("Enter a Number:");			//		   22
		int num = scanner.nextInt();					//		  333
		printPatterMethod(num); 						// 		 4444
		scanner.close();								//		55555
	}
	
	public static void printPatterMethod(int num) {
		
		for(int i = 1; i <= num; i++) {					
			for(int j = 1; j <= num - i; j++) {			
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
}
