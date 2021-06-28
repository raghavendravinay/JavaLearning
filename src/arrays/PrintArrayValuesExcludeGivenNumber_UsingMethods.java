package arrays;

import java.util.Scanner;

/**
 * This program will accept values from user and print the values excluding 22
 * @author RaghavendraVinayM
 *
 */

public class PrintArrayValuesExcludeGivenNumber_UsingMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[1000];
		System.out.println("Enter values into array");
		enterValuesIntoArray(arr);
		printValues(arr);
		scanner.close();
	}
	public static void enterValuesIntoArray(int arr[]) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 1; ; i++) {
			arr[i] = scanner.nextInt();
			if(arr[i] == 22) {
				break;
			}
		}
	}
	public static void printValues(int array[]) {
		for(int i = 1; ; i++) {
			if(array[i] == 22) {
				break;
			}
			System.out.print(array[i] + " ");
		}
	}
}
