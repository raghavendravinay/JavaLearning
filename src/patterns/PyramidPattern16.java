package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		for(int i = 1; i <= num; i++)				//		ex: num=5
		{											//			1
			for(int j = 1; j <= num - i; j++)		//		   2 2 
			{										//		  3 3 3 
				System.out.print(" ");				//		 4 4 4 4
			}										//		5 5 5 5 5
			for(int k = 1; k <= i; k++)
			{
				System.out.print(i + " ");
			}
			System.out.println(" ");
		}
		scanner.close();
	}
}
