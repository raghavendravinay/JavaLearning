package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");		
		int num = scanner.nextInt();						
		for(int i = num; i > 0; i--) {				//	ex:num=5	
			for(int j = 1; j <= num - i; j++) {		//	555555555	
				System.out.print(" ");				//	 4444444
			}										//	  33333
			for(int k = 1; k < 2 * i; k++) {		//	   222
				System.out.print(i);				//		1
			}
			System.out.println("");
		}
		scanner.close();
	}
}
