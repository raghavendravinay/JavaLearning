package arrays;

import java.util.Scanner;

/**
 * This program is allow user to enter values into array and check the array whether it is a super array or not
 * @author RaghavendraVinayM
 *
 */

public class SuperArray_UsingMethods {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter values into array");
		enterValuesIntoArray(arr, n);
		System.out.println("Enter a random number");
		int num = scanner.nextInt();
		
		if(validateSuperArray(n, arr, num)) {
			System.out.println("Super array");
		}
		else {
			System.out.println("Not a Super Array");
		}
		scanner.close();
	}
	public static void enterValuesIntoArray(int arr[], int n) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
	}
	public static boolean validateSuperArray(int n, int arr[], int num) {
	
		boolean superArray = false;
		while(n - 1 > 0) {
			for(int i = 0; i < n - 1;i++) {
				if((arr[i] + arr[n - 1]) == num) {
					superArray = true;
					break;
				}
			}
			n--;
		}
		return superArray;
	}
}