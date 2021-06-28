package arrays;

import java.util.Scanner;

/**
 * This program is allow user to enter values into two 2d arrays and print multiplication of those two array values
 * @author RaghavendraVinayM
 *
 */
public class MultiplicationOfTwoDimensionalArrays2_UsingMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row size and column size for 1st matrix");
		int r1 = scanner.nextInt();
		int c1 = scanner.nextInt();
		System.out.println("Enter row size and column size for 2nd matrix");
		int r2 = scanner.nextInt();
		int c2 = scanner.nextInt();
		
		int[][] A = new int[r1][c1];
		int[][] B = new int[r2][c2];
		int[][] AB = new int[r1][c2];
		
		System.out.println("Enter values into 1st array");
		addValuesIntoArray(A, r1, c1);
		System.out.println("Enter values into 2nd array");
		addValuesIntoArray(B, r2, c2);
		
		if(c1 == r2) {
			arrayMultiplication(A, B, AB, r1, c1, c2);
		}
		else {
			System.out.println("Matrix multiplication is not possible");
		}
		scanner.close();		
	}
	public static void addValuesIntoArray(int A[][], int r1, int c1) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c1; j++) {
				A[i][j] = scanner.nextInt();
			}
		}
	}
	public static void arrayMultiplication(int A[][], int B[][], int AB[][], int r1, int c1, int c2) {
		
		int i, j, k;
		for(i = 0; i < AB.length; i++) {
			for(j = 0; j < AB[i].length; j++) {
				for(k = 0; k < c1; k++) {
					AB[i][j] = AB[i][j] + (A[i][k] * B[k][j]);
				}
			}
		}
		for(i = 0; i < AB.length; i++) {
			for(j = 0; j < AB[i].length; j++) {
				System.out.print(AB[i][j] + " ");
			}
			System.out.println(" ");
		}	
	}
}
