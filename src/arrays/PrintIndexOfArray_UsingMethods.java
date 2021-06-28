package arrays;

import java.util.Scanner;

/**
 * This program is to allow user to add values into array and print the count of the given number if not found prints -1
 * @author RaghavendraVinayM
 *
 */

public class PrintIndexOfArray_UsingMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n = scanner.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		System.out.println("Enter values into array");
		enterValuesIntoArray(arr1);
		System.out.println("Enter searching number");
		int num = scanner.nextInt();
		printCountOfTheKeyNumber(arr1, num, arr2);
		scanner.close();
	}
	
	public static void enterValuesIntoArray(int arr1[]) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}
	}
	public static void printCountOfTheKeyNumber(int arr1[], int num, int arr2[]) {
		
		int l = 0, k = 0;
		for(int j = 0; j < arr1.length; j++) {
			if(arr1[j] == num) {
				arr2[k] = j;
				l = k;
				k++;
			}
		}
		System.out.println(k+"index(es) ");
		
		for(int i = 0; i <= l; i++) {
			if(k > 0) {
				System.out.print(arr2[i] + " ");
			}
			else {
				System.out.println("-1");
			}
		}
	}
}
