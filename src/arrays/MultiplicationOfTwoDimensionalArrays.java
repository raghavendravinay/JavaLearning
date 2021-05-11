package arrays;

import java.util.Scanner;
/**
 * This program will allow user to enter values into two 2d arrays and print multiplication of those two array values
 * @author RaghavendraVinayM
 *
 */
public class MultiplicationOfTwoDimensionalArrays {

	public static void main(String[] args) {
		int i, j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		System.out.println("Enter values into 1st array");
		int[][] array1=new int[size][size];
		int[][] array2=new int[size][size];
		int[][] array3=new int[size][size];
		for(i=0; i<array1.length; i++) {
			for(j=0; j<array1.length; j++) {
				array1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter values into 2nd array");
		for(i=0; i<array2.length; i++) {
			for(j=0; j<array2.length; j++) {
				array2[i][j]=sc.nextInt();
			}
		}

		for(i=0; i<array3.length; i++) {
			for(j=0; j<array3.length; j++) {
				array3[i][j]=array1[i][j]*array2[i][j];
//				System.out.print(array3[i][j]+" ");
				System.out.println("array1["+i+"]["+j+"] * "+"array2["+i+"]["+j+"]= "+array3[i][j] );
			}
//			System.out.println(" ");
		}

	}
}
