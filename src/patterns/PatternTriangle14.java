package patterns;

import java.util.Scanner;

/**
 * This program to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle14 {

	public static void main(String[] args) {	
														// 	ex: num=5
		Scanner scanner = new Scanner(System.in);		//	12345
		System.out.println("Enter a number:");			//	 1234
		int num = scanner.nextInt();					//	  123
		for(int i = num; i > 0; i--) {					//	   12
			for(int j = i; j < num; j++) {				//		1
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		scanner.close();
	}
}
