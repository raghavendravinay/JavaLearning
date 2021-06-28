package arrays;

import java.util.Scanner;

/**
 * This program is to allow the user to enter values into an array 
 * and print whether the key word is present in the array or not by asking user to enter a value
 * @author RaghavendraVinayM
 *
 */

public class FindElementFromArray2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the number");
		int n = scanner.nextInt();
		System.out.println("Length of the array is "+n);
		int arr[] = new int[n];
		System.out.println("Enter values into array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		boolean found = false;
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == num) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("Given number is found");
		}
		else {
			System.out.println("Given number is not found");
		}
		scanner.close();
	}
}
