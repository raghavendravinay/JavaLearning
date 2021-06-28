package arrays;
import java.util.Scanner;

/**
 * This program is to allow user to enter values into two arrays 
 * And add the values of 1st array with 2nd array 
 * And print additional values as a new array
 * @author RaghavendraVinayM
 *
 */
public class AdditionOf2TwoDimensionalArrays_UsingMethods {
	static Scanner scanner;
	public static void main(String args[]){

		scanner = new Scanner(System.in);
		System.out.println("Enter row size (row size and column size is same)");
		int size = scanner.nextInt();
		int[][] array1 = new int[size][size];
		int[][] array2 = new int[size][size];
		int[][] array3 = new int[size][size];
		System.out.println("Enter values into 1st array");
		addingValuesIntoArray(array1);
		System.out.println("Enter values into 2nd array");
		addingValuesIntoArray(array2);
		addingTwoArrays(array1, array2, array3);	

		scanner.close();
	}
	public static void addingValuesIntoArray(int array[][]) {
		scanner = new Scanner(System.in);
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
	}
	public static void addingTwoArrays(int array1[][], int array2[][], int array3[][] ) {
		for(int i = 0; i < array3.length; i++) {
			for(int j = 0; j < array3.length; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
				System.out.print(array3[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}
}
