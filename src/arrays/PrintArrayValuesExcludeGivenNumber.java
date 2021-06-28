package arrays;

import java.util.Scanner;

/**
 * This program will accept values from user and print the values excluding 22
 * @author RaghavendraVinayM
 *
 */

public class PrintArrayValuesExcludeGivenNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[1000];
		System.out.println("Enter values into array");
		for(int i = 1; ; i++) {
			arr[i] = scanner.nextInt();
			if(arr[i] == 22) {
				break;
			}
		}
		for(int i = 1; ; i++) {
			if(arr[i] == 22) {
				break;
			}
			System.out.print(arr[i] + " ");
		}
		scanner.close();
	}
}
