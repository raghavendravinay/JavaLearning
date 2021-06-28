package arrays;
import java.util.Scanner;

/**
 * This program is to allow the user to enter values into an array and find a key present in the array by asking user to enter a value
 * @author RaghavendraVinayM
 *
 */

public class FindElementFromArray_UsingMethods {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the array");
		int n = scanner.nextInt();
		System.out.println("Length of the array is: "+n);
		System.out.println("Enter values in array");
		int array[] = new int[n];
		addingValuesIntoArray(array);
		System.out.println("Enter a value");
		int num = scanner.nextInt();
		searchAValueFromArray(array, num);
		scanner.close();
	}
	public static void addingValuesIntoArray(int array[]) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
	}
	public static void searchAValueFromArray(int array[], int num) {
		for(int j = 0; j < array.length; j++) {
			if(array[j] == num) {
				System.out.println("Given number is found");
			}
		}
	}
}
