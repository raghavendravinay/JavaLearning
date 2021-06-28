package arrays;

import java.util.Scanner;

/**
 * This program is to find the given number is Armstrong Number or not? with position
 * @author RaghavendraVinayM
 *
 */

public class FindPositionOfTheElement2 {

	//find the position of a given number
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		System.out.println("Length of the array is " + n);
		int arr[] = new int[n];
		System.out.println("Add values into the array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter a number to find");
		int num = scanner.nextInt();
		boolean found = false;
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == num) {
				found = true;
				n = j;
			}
		}
		if(found) {
			System.out.println("Given number " + num + " is found at position " + ++n);
		}
		else {
			System.out.println("Given number was not found");
		}
		scanner.close();
	}
}
