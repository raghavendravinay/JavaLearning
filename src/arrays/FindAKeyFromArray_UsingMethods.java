package arrays;

import java.util.Scanner;

/**
 * This program is to allow the user to enter values into an array and find a key present in the array by asking user to enter a value
 * @author RaghavendraVinayM
 *
 */

public class FindAKeyFromArray_UsingMethods {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int key, size;
		System.out.println("Enter row size (row size and column size is same)");
		size = scanner.nextInt();
		int[][] array = new int[size][size];
		System.out.println("Enter values into array:");
		addingValuesIntoArray(array);
		
		System.out.println("Enter a value to find from the array");
		key = scanner.nextInt();
		
		searchAValueFromArray(array, key, size);
		
		scanner.close();
	}
	public static void addingValuesIntoArray(int array[][]) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
	}
	public static void searchAValueFromArray(int array[][], int key, int size) {
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(array[i][j] == key) {
					System.out.println("Given value was found");
					break;
				}
			}
		}
	}
}
