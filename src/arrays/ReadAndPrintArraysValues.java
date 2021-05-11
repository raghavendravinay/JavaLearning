package arrays;

import java.util.Scanner;
/**
 * This code will allow user to enter values into array and print the array values in matrix form
 * @author RaghavendraVinayM
 *
 */
public class ReadAndPrintArraysValues {
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Enter array size");
		int size=sc.nextInt();
		System.out.println("Enter values into array");
		int[][] array=new int[size][size];
		for( i=0; i<size; i++) {
			for( j=0; j<size; j++) {
				array[i][j]=sc.nextInt();
			}
		}
		for(i=0; i<size; i++) {
			for(j=0; j<size; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
