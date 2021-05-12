package arrays;

import java.util.Scanner;
/**
 * This program will allow user to enter values into two 2d arrays and print multiplication of those two array values
 * @author RaghavendraVinayM
 *
 */
public class MultiplicationOfTwoDimensionalArrays {

	public static void main(String[] args) {
		int i, j, k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size and column size for 1st matrix");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter row size and column size for 2nd matrix");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		System.out.println("Enter values into 1st array");
		int[][] A=new int[r1][c1];
		int[][] B=new int[r2][c2];
		int[][] AB=new int[r1][c2];
		for(i=0; i<r1; i++) {
			for(j=0; j<c1; j++) {
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter values into 2nd array");
		for(i=0; i<r2; i++) {
			for(j=0; j<c2; j++) {
				B[i][j]=sc.nextInt();
			}
		}
		if(c1==r2) {
			for(i=0; i<c2; i++) {
				for(j=0; j<r1; j++) {
					for(k=0; k<c2; k++) {
						AB[i][j]=AB[i][j]+(A[i][k]*B[k][j]);
					}
				}
			}
			for(i=0; i<r1; i++) {
				for(j=0; j<c2; j++) {
					System.out.print(AB[i][j]+" ");
				}
				System.out.println(" ");
			}
		}
		else {
			System.out.println("Matrix multiplication is not possible");
		}
	}
}
