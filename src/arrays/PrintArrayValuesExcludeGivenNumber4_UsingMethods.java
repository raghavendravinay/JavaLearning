package arrays;

import java.util.Scanner;

/**
 * This program is to allow user to enter values into the array except 22 and
 * print the values
 * @author RaghavendraVinayM
 *
 */

public class PrintArrayValuesExcludeGivenNumber4_UsingMethods {

	public static void main(String []args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size of the array");
		int n = scanner.nextInt(); 
		System.out.println("Enter values into array");
		int arr[] = new int[n];
		enterValuesIntoArray(arr, n);
		scanner.close();
	}
	public static void enterValuesIntoArray(int arr[], int n) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while(i < n) {

			arr[i] = scanner.nextInt(); 
			if(arr[i] != 22) {
				i++;
			}
			/* if(arr[i] == 22) {
			 * 
			 * } else { i++; }
			 */
		}
		for(int j = 0; j < n; j++) {
			System.out.print(arr[j] + " ");
		}}

}