package patterns;

import java.util.Scanner;

/**
 * This program is to print the triangle pattern
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle1 {

	public static void main(String[] args) {				//	ex: num=5
		Scanner scanner = new Scanner(System.in);			//	*
		System.out.println("Enter a number:");				//  * *
		int num = scanner.nextInt();						//	* * *
		for(int i = 1; i <= num; i++) {						//	* * * *
			for(int j = 1; j <= i; j++) {					//	* * * * *
				System.out.print("* ");				
			}
			System.out.println("");
		}
		scanner.close();
	}
}
