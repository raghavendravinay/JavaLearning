package patterns;

import java.util.Scanner;

/**
 * This program to print the Square pattern
 * @author RaghavendraVinayM
 *
 */

public class SquarePattern3 {

	public static void main(String[] args) {		
		
		Scanner scanner = new Scanner(System.in);			
		System.out.println("Enter a number:");		
		int num = scanner.nextInt();						
		for(int i = 1; i <= num; i++) {				// ex:num=5	
			for(int j = 1; j <= num; j++) {			//	1 2 3 4 5
				System.out.print(j + " ");			//	1 2 3 4 5
			}										//	1 2 3 4 5
			System.out.println("");					//	1 2 3 4 5
		}											//	1 2 3 4 5
		scanner.close();
	}
}
