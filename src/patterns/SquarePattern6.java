package patterns;

import java.util.Scanner;

/**
 * This program to print the Square pattern
 * @author RaghavendraVinayM
 *
 */

public class SquarePattern6 {

	//Prints 'O' at center of the square and 'X' at remaining places
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any odd number"); 		
		int num = scanner.nextInt();								
		for(int i = 1; i <= num; i++)							//	ex:5		
		{														//	X X X X X	
			for(int j = 1; j <= num; j++) 						//	X X X X X		
			{													//	X X O X X
				if(i == (num + 1) / 2 && j == (num + 1) / 2)	//	X X X X X
				{												//	X X X X X
					System.out.print("O ");
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.println("");
		}
		scanner.close();
	}
}
