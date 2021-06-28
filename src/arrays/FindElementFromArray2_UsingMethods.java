package arrays;

import java.util.Scanner;

/**
 * This program is to allow the user to enter values into an array 
 * and print whether the key word is present in the array or not by asking user to enter a value
 * @author RaghavendraVinayM
 *
 */

public class FindElementFromArray2_UsingMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the number");
		int size = scanner.nextInt();
		System.out.println("Length of the array is " + size);
		int array[] = new int[size]; 
		System.out.println("Enter values into array");
		enterValuesIntoArray(array);
		
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		
		if(searchAValueFromArray(array, num)) {
			System.out.println("Given number is found");
		}
		else {
			System.out.println("Given number is not found");
		}
		scanner.close();
	}
	public static void enterValuesIntoArray(int array[]) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
	}
	
	public static boolean searchAValueFromArray(int array[], int num) {
			boolean found = false;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				found = true;
				break;
			}
		}
		return found;
	}
}
