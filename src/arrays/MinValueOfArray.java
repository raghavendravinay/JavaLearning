package arrays;

import java.util.Scanner;

/**
 * This program is to find the minimum number from the given array
 * @author RaghavendraVinayM
 *
 */

public class MinValueOfArray {
	
	public static void main(String[]args) {
	
		Scanner scanner = new Scanner(System.in);
	System.out.println("enter array size");
	int n = scanner.nextInt();
	int arr[] = new int[n];
	System.out.println("enter values into array");
	for(int i = 0; i < n; i++){
		arr[i] = scanner.nextInt();
	}
	int min = arr[n - 1];
	for(int i = n - 1; i >= 0; i--)
	{
	if(min > arr[i]) {
		min = arr[i];
	}
	}
	System.out.println(min);
	scanner.close();
	}
}
