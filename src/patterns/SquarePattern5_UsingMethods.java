package patterns;

import java.util.Scanner;

/**
 * This program to print the Square pattern
 * @author RaghavendraVinayM
 *
 */

public class SquarePattern5_UsingMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");		
		int num = scanner.nextInt();						
		printPyramidPattern(num);
		scanner.close();
	}
	public static void printPyramidPattern(int num) {

		for(int i = 1; i <= num; i++) 			// ex: num=5		
		{										// O X X X X	
			for(int j = 1; j <= num; j++)		// X O X X X		
			{									// X X O X X	
				if(i == j)						// X X X O X
				{								// X X X X O
					System.out.print("O ");
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.println(" ");
		}
	}
}
