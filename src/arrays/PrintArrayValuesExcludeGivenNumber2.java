package arrays;

import java.util.Scanner;

/**
 * This program is to allow user to enter values and stop it when user enters 22
 * print all the values from the array excluding 22
 * @author RaghavendraVinayM
 *
 */

public class PrintArrayValuesExcludeGivenNumber2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[1000];
		int i = 0, n;
		System.out.println("Enter values into array");
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
		scanner.close();
	}
}
