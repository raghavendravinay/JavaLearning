package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern4_UsingMethods {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);				
		System.out.println("Enter a number:");		
		int num = scanner.nextInt();							
		for(int i = 1; i <= num; i++) {						
			for(int j = 1; j <= num - i; j++) {				
				System.out.print(" ");				//	ex:num=5
			}										//			1
			for(int k = 1; k < 2 * i; k++) {		//		   123
				System.out.print(k);				//		  12345
			}										//		 1234567
			System.out.println("");					//		123456789
		}
		scanner.close();
	}
}
