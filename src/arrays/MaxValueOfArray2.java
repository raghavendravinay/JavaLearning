package arrays;

import java.util.Scanner;

/**
 * This program is to find the maximum number from the given array
 * @author RaghavendraVinayM
 *
 */

public class MaxValueOfArray2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array size");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("enter values into array");
		for(int i = 0; i < n; i++){
			arr[i] = scanner.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n - 1; i++)
		{
		if(max<arr[i + 1]) {
			max=arr[i + 1];
		}
		}
		System.out.println(max);
		scanner.close();
		}
}
