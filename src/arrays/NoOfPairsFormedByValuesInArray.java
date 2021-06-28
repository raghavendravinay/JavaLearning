package arrays;

import java.util.Scanner;

/**
 * This program will print no. of pairs formed by from the values of the array
 * @author RaghavendraVinayM
 *
 */
public class NoOfPairsFormedByValuesInArray {

	public static void main(String []args) {
		
		int count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = scanner.nextInt();
		System.out.println("Enter values into array");
		int array[] = new int[size];
		int temp[] = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			temp[i] = array[i];
		}
		for(int i = 0; i < size; i++) {
			if(temp[i] != -1) {
				for(int j = i + 1; j < size; j++) {
					if(temp[i] == temp[j]) {
						++count;
						temp[j] = -1;
						break;
					}
				}
			}
		}
		System.out.println(count + " no of pairs can form, from the array ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		scanner.close();
	}
}
