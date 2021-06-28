package arrays;
import java.util.Scanner;

/**
 * THis program will print the values of the array
 * @author RaghavendraVinayM
 *
 */
public class PrintArrayValues_UsingMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the array");
		int n = scanner.nextInt();
		System.out.println("Length of the array is: "+n);
		int arr[] = new int[5];
		System.out.println("enter values");
		addValuesIntoArray(arr);
		printValues(arr);
		scanner.close();
	}
	public static void addValuesIntoArray(int array[]) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			
		}
	}
	
	public static void printValues(int array[]) {
		
		System.out.println("data in array are: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
