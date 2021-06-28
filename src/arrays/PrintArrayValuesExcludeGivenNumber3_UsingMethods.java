package arrays;

import java.util.Scanner;

/**
 * This program will allow user to enter values except 22 
 * And print the values 
 * @author RaghavendraVinayM
 *
 */
public class PrintArrayValuesExcludeGivenNumber3_UsingMethods {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size of the array");
		int n = scanner.nextInt(); 
		int arr[] = new int[n];
		enterValuesIntoArray(arr);
		printValues(arr);
		scanner.close();
	}
	public static void enterValuesIntoArray(int arr[]) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values into array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if(arr[i] == 22) {
				System.out.println("22 is not accepting. enter another number");
				i--;
			}
		}		
	}
	public static void printValues(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
