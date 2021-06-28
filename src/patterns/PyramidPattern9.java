package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern9 {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");		
		int num = scanner.nextInt();						
		for(int i = num; i > 0; i--) {				//	ex: num=5	
			for(int j = 1; j <= num - i; j++) {		//	999999999	
				System.out.print(" ");				//	 7777777
			}										//	  55555
			for(int k = 1; k < 2 * i; k++) {		//	   333
				System.out.print((2 * i) - 1);		//		1
			}
			System.out.println("");
		}
		scanner.close();
	}
}
