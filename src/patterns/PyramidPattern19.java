package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern19 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		for(int i = num; i > 0; i--)					//ex: num=5
		{												//		5 5 5 5 5
			for(int j = i; j < num; j++) 				//		 4 4 4 4 
			{											//		  3 3 3 
				System.out.print(" ");					//		   2 2
			}											//			1
			for(int k = i; k > 0; k--)
			{
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
		scanner.close();
	}
}
