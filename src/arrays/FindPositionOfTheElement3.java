package arrays;

import java.util.Scanner;

/**
 * This program is to print the no of positions present for the given number
 * @author RaghavendraVinayM
 *
 */

public class FindPositionOfTheElement3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		System.out.println("Length of the array is "+n);
		int arr[] = new int[n];
		int arr2[] = new int[n];
		System.out.println("Add values into the array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter a number to find");
		int num = scanner.nextInt();
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == num) {
				arr2[j] = 1;
			}
		}
		System.out.println("Given number found at position(s)");
		for(int k = 0; k < arr2.length; k++) {
			if(arr2[k] == 1) {
				n = k;
				System.out.print(++n + " ");
			}
		}
		scanner.close();
	}
}
