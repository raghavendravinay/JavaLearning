package patterns;

import java.util.Scanner;

/**
 * This program to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle3 {

	public static void main(String[] args) {		
													//		ex:num=5
		Scanner scanner = new Scanner(System.in);	//			*
		System.out.println("Enter a number:");		//		   **
		int num = scanner.nextInt();				//		  ***
		for(int i = num; i > 0; i--) {				//		 ****
			for(int j = i - 1; j > 0; j--) {		//		*****
				System.out.print(" ");
			}
			for(int k = i; k <= num; k++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		scanner.close();
	}
}
