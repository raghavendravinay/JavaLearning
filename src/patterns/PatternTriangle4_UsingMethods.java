package patterns;

import java.util.Scanner;

/**
 * This program to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle4_UsingMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);			//	ex: num=5
		System.out.println("Enter a number:");				//	*****
		int num = scanner.nextInt();						//	 ****
		printPatternTriangle(num);							//	  ***
															//	   **
		scanner.close();									//		*
	}
	public static void printPatternTriangle(int num) {
		
		for(int i = num; i > 0; i--) {						
			for(int j = i; j < num; j++) {					
				System.out.print(" ");						
			}
			for(int k = i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
