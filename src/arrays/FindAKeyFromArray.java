package arrays;

import java.util.Scanner;

/**
 * This program is to allow the user to enter values into an array and find a key present in the array by asking user to enter a value
 * @author RaghavendraVinayM
 *
 */

public class FindAKeyFromArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i, j, key;
		System.out.println("Enter row size (row size and column size is same)");
		int size = scanner.nextInt();
		System.out.println("Enter values into array:");
		int[][] array = new int[size][size];
		for(i = 0; i < array.length; i++) {
			for(j = 0; j < array.length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter a value to find from the array");
		key = scanner.nextInt();
		for(i = 0; i < array.length; i++) {
			for(j = 0; j < array.length; j++) {
				if(array[i][j] == key) {
					System.out.println("Given value was found");
					break;
				}
			}
		}
		scanner.close();
	}
}
