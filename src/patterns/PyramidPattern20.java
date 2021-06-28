package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern20 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();				
		printPyramidPattern(num);
		scanner.close();
	}
	public static void printPyramidPattern(int num) {
		
		for(int i = num; i > 0; i--)				
		{									//	ex: num=5		
			for(int j = i; j < num; j++)	//	5 4 3 2 1			
			{								//   4 3 2 1		
				System.out.print(" ");		//	  3 2 1
			}								//	   2 1
			for(int k = i; k > 0; k--) 		//		1
			{
				System.out.print(k + " ");
			}
			System.out.println(" ");
		}
	}
}
