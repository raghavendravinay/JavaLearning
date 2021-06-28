package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern22 {

	public static void main(String[] args) {		
													
		Scanner scanner = new Scanner(System.in);			
		System.out.println("Enter a number:");		
		int num = scanner.nextInt();				
		for(int i = 1; i <= num; i++) {				
			for(int j = 1; j <= num - i; j++) {		
				System.out.print(" ");			
			}										//		ex:num=5
			for(int k = 1; k <= i; k++) {			//			1
				System.out.print(i + " ");			//		   2 2
			}										//		  3 3 3
			System.out.println("");					//		 4 4 4 4
		}											//		5 5 5 5 5
		for(int l = 1; l <= num; l++) {				//		 4 4 4 4
			for(int m = 1; m <= l; m++) {			//		  3 3 3
				System.out.print(" ");				//		   2 2
			}										//			1
			for(int n = num - l; n > 0; n--) {
				System.out.print(n + " ");
			}
			System.out.println("");
		}
		scanner.close();
	}
}
