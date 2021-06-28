package arrays;

import java.util.Scanner;

/**
 * This program is to allow user to enter values and stop it when user enters 22
 * print all the values from the array excluding 22
 * @author RaghavendraVinayM
 *
 */

public class PrintArrayValuesExcludeGivenNumber2_UsingMethods {

	public static void main(String[] args) {
		
		int arr[] = new int[1000];
		System.out.println("Enter values into array");
		printValuesFromArray(arr);
	}
	
	public static void printValuesFromArray(int arr[]) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int i = 0, n;
		while(true) {
			arr[i] = scanner.nextInt();
			if(arr[i] == 22) {
				n = i;
				break;
			}
			i++;
		}
		for(int j = 0; j < n; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
