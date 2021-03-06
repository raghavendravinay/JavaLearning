package patterns;

import java.util.Scanner;

/**
 * This program to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);		//	ex:num=5
		System.out.println("Enter a number:");			//	1 2 3 4 5
		int num = scanner.nextInt();					//	1 2 3 4
		for(int i = 1; i <= num; i++) {					//  1 2 3
			for(int j = 1; j <= num + 1 - i; j++) {		//	1 2
				System.out.print(j + " ");				//	1
			}
			System.out.println(" ");
		}
		scanner.close();
	}
}
