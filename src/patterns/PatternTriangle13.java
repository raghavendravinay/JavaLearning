package patterns;

import java.util.Scanner;

/**
 * This program to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle13 {

	public static void main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);		//	ex:num=5
		System.out.println("Enter a Number");			//	55555
		int num = scanner.nextInt();					//	 4444
		for(int i = num; i > 0; i--) {					//	  333
			for(int j = i; j < num; j++) {				//	   22
				System.out.print(" ");					//		1
			}
			for(int k = i; k > 0; k--) {
				System.out.print(i);
			}
			System.out.println("");
		}
		scanner.close();
	}
}
