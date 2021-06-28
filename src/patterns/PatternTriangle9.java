package patterns;

import java.util.Scanner;

/**
 * This program to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle9 {

	public static void main(String[] args) {	
														//	ex:num=5
		Scanner scanner =new Scanner(System.in);		//	5 5 5 5 5
		System.out.println("Enter a number:");			//	4 4 4 4
		int num = scanner.nextInt();					//	3 3 3 
		for(int i = num; i > 0; i--) {					//  2 2
			for(int j = 1; j <= i; j++) {				//	1
				System.out.print(i + " ");
			}
			System.out.println("");
		}
		scanner.close();
	}
}
