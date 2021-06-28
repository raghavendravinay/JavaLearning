package arrays;
import java.util.Scanner;

/**
 * This program is to allow the user to enter values into an array and find a key present in the array by asking user to enter a value
 * @author RaghavendraVinayM
 *
 */

public class FindElementFromArray {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the array");
		int n = scanner.nextInt();
		System.out.println("Length of the array is: " + n);
		System.out.println("Enter values in array");
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter a value");
		int num = scanner.nextInt();
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] == num) {
				System.out.println("Given number was found in this array");
			}
		}
		scanner.close();
	}
}
