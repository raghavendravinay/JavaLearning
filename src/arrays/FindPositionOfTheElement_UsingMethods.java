package arrays;

import java.util.Scanner;

/**
 * This program is to find the given number and print the position of the number
 * @author RaghavendraVinayM
 *
 */

public class FindPositionOfTheElement_UsingMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		System.out.println("Length of the array is: " + n);
		int array[] = new int[n];
		System.out.println("Enter values into array");
		enterValuesIntoArray(array);
		
		System.out.println("Enter a number to search");
		int num = scanner.nextInt();
		
		
		if(searchAValueFromArray(array, num)) {
			System.out.println(num + " is found" );
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
		int n = 0;
		for(int j = 0; j < array.length; j++) {
			if(array[j] == num) {
				found = true;
				n = j;
				System.out.println("position of the given number is " + ++n);
				break;
			}
		}
		
		return found;
		}
}
