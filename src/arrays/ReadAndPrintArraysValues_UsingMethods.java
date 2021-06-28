package arrays;

import java.util.Scanner;

/**
 * This code will allow user to enter values into array and print the array values in matrix form
 * @author RaghavendraVinayM
 *
 */

public class ReadAndPrintArraysValues_UsingMethods {
	
	public static void main(String []args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row size");
		int row = scanner.nextInt();
		System.out.println("Enter Column size");
		int col = scanner.nextInt();
		int[][] array = new int[row][col];
		System.out.println("Enter values into array");
		enterValueIntoArray(array, row, col);
		printValuesFromArray(array, row, col);
		scanner.close();
	}
	public static void enterValueIntoArray(int array[][], int row, int col) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
	}
	public static void printValuesFromArray(int array[][], int row, int col) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
