package patterns;

import java.util.Scanner;

/**
 * This program to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle12_UsingMethods {

	public static void main(String []args) {		//	ex:num5
		Scanner scanner = new Scanner(System.in);	//		1
		System.out.println("Enter a Number");		//	   12	
		int num = scanner.nextInt();				//	  123	
		for(int i = 1; i <= num; i++) {				//	 1234
			for(int j = 1; j <= num - i; j++) {		//  12345
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
