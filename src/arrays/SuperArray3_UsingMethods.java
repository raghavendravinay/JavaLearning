package arrays;

import java.util.Scanner;


/**
 * This program is allow user to enter values into array and check the array whether it is a super array or not
 * @author RaghavendraVinayM
 *
 */

public class SuperArray3_UsingMethods {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter values into array");
		addValuesIntoArray(arr, n);
		System.out.println("Enter a random number");
		int num = scanner.nextInt();
		
			
		if(isSuperArray(n, arr, num)) {
			System.out.println("Super array");
		}
		else {
			System.out.println("Not a Super Array");
		}
		scanner.close();
	}
	public static void addValuesIntoArray(int arr[], int n) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
	}
	public static boolean isSuperArray(int n, int arr[], int num) {
		
		int sum = 0;
		boolean superArray = false;
		Stop:		//Labeled break
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					sum = arr[i] + arr[j];
					if(sum == num) {
						superArray = true;
						break Stop;
					}
				}
			}
		return superArray;
	}
}
