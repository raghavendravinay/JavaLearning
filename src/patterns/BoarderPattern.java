package patterns;

import java.util.Scanner;

/**
 * This program is to print the Boarder pattern
 * @author RaghavendraVinayM
 *
 */

public class BoarderPattern {

	public static void main(String[] args) {				//	ex: num=5
		Scanner scanner = new Scanner(System.in);			//	* * * * *	
		System.out.println("Enter a number");				//	*		*	
		int num = scanner.nextInt();						//	*		*
		for(int i= 1; i <= num; i++) {						//	*		*
			for(int j = 1; j <= num; j++) {					//	* * * * *
				if(i == 1 || i == num || j == 1 || j == num) {
					System.out.print("* ");
				}
				else {
				System.out.print("  ");
				}
			}
			System.out.println("");
		}
		scanner.close();
	}
}
