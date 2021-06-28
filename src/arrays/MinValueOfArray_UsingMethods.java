package arrays;

import java.util.Scanner;

/**
 * This program is to find the minimum number from the given array
 * @author RaghavendraVinayM
 *
 */

public class MinValueOfArray_UsingMethods {
	
	public static void main(String[]args) {
	
		Scanner scanner = new Scanner(System.in);
	System.out.println("enter array size");
	int n = scanner.nextInt();
	int arr[] = new int[n];
	System.out.println("enter values into array");
	enterValuesIntoArray(arr);
	findMaxValue(arr, n);
	scanner.close();
	}
	public static void enterValuesIntoArray(int arr[]) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++){
			arr[i] = scanner.nextInt();
		}
	}
	public static void findMaxValue(int arr[], int n) {
		int min = arr[n - 1];
		for(int i = n - 1; i >= 0; i--)
		{
		if(min > arr[i]) {
			min = arr[i];
		}
		}
		System.out.println(min);
	}
}
