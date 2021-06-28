package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern18 {

	public static void main(String[] args)	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		for(int i = num; i > 0; i--)					//	ex:num=5
		{												//	* * * * *	
			for(int j = i; j <= num; j++)				//   * * * *
			{											//    * * *
				System.out.print(" ");					//	   * * 
			}											//	    *
			for(int k = 1; k <= i; k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		scanner.close();
	}
}
