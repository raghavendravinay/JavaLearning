package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern17_UsingMethods {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		printPyramidPattern(num);
		scanner.close();
	}
	public static void printPyramidPattern(int num) {

		for(int i = 1; i <= num; i++)				//		ex=num=5
		{											//				1
			for(int j = 1; j <= num - i; j++)		//			   1 2
			{										//			  1 2 3
				System.out.print(" ");				//			 1 2 3 4
			}										//			1 2 3 4 5
			for(int k = 1; k <= i; k++)
			{
				System.out.print(k + " ");
			}
			System.out.println(" ");
		}
	}
}
