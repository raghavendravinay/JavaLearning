package arrays;

import java.util.Scanner;

/**
 * This code will allow user to enter values into array and print the array values in matrix form
 * @author RaghavendraVinayM
 *
 */

public class ReadAndPrintArraysValues {
	
	public static void main(String []args) {

		Scanner scanner = new Scanner(System.in);
		int i, j;
		System.out.println("Enter row size");
		int row = scanner.nextInt();
		System.out.println("Enter column size");
		int col = scanner.nextInt();
		System.out.println("Enter values into array");
		int[][] array = new int[row][col];
		for( i = 0; i < row; i++) {
			for( j = 0; j < col; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		for( i = 0; i < row; i++) {
			for( j = 0; j < col; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
		scanner.close();
	}
}
