package arrays;
import java.util.Scanner;

/**
 * THis program will print the values of the array
 * @author RaghavendraVinayM
 *
 */
public class PrintArrayValues {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the array");
		int n = scanner.nextInt();
		System.out.println("Length of the array is: "+n);
		System.out.println("enter values");
		int arr[] = new int[5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("data in array are: ");
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		scanner.close();
	}
}
