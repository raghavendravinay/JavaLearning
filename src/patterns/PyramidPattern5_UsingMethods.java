package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern5_UsingMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");		
		int num = scanner.nextInt();				
		printPyramidPattern(num);
		scanner.close();
	}
	public static void printPyramidPattern(int num) {
		
		for(int i = 1; i <= num; i++) {				
			for(int j = 1; j <= num - i; j++) {			
				System.out.print(" ");				//ex:num=5
			}										//			1
			for(int k = (2 * i) - 1; k > 0; k--) {	//		   321
				System.out.print(k);				//		  54321
			}										//		 7654321
			System.out.println("  ");				//		987654321
		}
	}
}
