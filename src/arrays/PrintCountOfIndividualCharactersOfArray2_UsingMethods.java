package arrays;

import java.util.Scanner;

/**
 * This program will allow user to enter values into array and print the count the each number
 * @author RaghavendraVinayM
 *
 */

public class PrintCountOfIndividualCharactersOfArray2_UsingMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		int array[] = new int[size];
		int temp[] = new int[size];
		int num[] = new int[size];
		System.out.println("Enter values into array");
		enterValuesIntoArray(array, temp);
		countOfTheValues(temp, num, size);
		scanner.close();
	}

	public static void enterValuesIntoArray(int array[], int temp[]) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			temp[i] = array[i];
		}
	}

	public static void countOfTheValues(int temp[], int num[], int size) {

		int k = 0;
		int count;
		for(int i = 0; i < size; i++) {
			count = 1;

			if(temp[i] != -1) {
				for(int j = i + 1; j < size; j++) {
					if(temp[i] == temp[j]) {
						++count;
						temp[j] = -1;
					}
				}
				num[k++] = count;
			}
		}
		k = 0;
		for(int i = 0; i < size; i++) {
			if(temp[i] != -1)
				System.out.println(temp[i] + " occurs " + num[k++] + " times");
		}
	}
}