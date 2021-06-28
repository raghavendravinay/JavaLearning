package arrays;

import java.util.Scanner;

/**
 * This program is to print the given values i.e., only 10, 20, 30, 40, 50, 60, 70, 80 & 90
 * And print count of the values
 * @author RaghavendraVinayM
 *
 */
public class PrintCountOfIndividualCharactersOfArray_UsingMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("Enter values into array");
		printValuesFromArray(array);
		scanner.close();
	}
	public static void printValuesFromArray(int array[]) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int a1, a2, a3, a4, a5, a6, a7, a8, a9;
		a1 = a2 = a3 = a4 = a5 = a6 = a7 = a8 = a9 = 0;
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			if(array[i] == 10)
				a1++;
			else if(array[i] == 20)
				a2++;
			else if(array[i] == 30)
				a3++;
			else if(array[i] == 40)
				a4++;
			else if(array[i] == 50)
				a5++;
			else if(array[i] == 60)
				a6++;
			else if(array[i] == 70)
				a7++;
			else if(array[i] == 80)
				a8++;
			else if(array[i] == 90)
				a9++;
			else 
				i--;
		}
		if(a1 > 0)
			System.out.println("10 occurs " + a1 + " times");
		if(a2 > 0)
			System.out.println("20 occurs " + a2 + " times");
		if(a3 > 0)
			System.out.println("30 occurs " + a3 + " times");
		if(a4 > 0)
			System.out.println("40 occurs " + a4 + " times");
		if(a5 > 0)
			System.out.println("50 occurs " + a5 + " times");
		if(a6 > 0)
			System.out.println("60 occurs " + a6 + " times");
		if(a7 > 0)
			System.out.println("70 occurs " + a7 + " times");
		if(a8 > 0)
			System.out.println("80 occurs " + a8 + " times");
		if(a9 > 0)
			System.out.println("90 occurs " + a9 + " times");
	}
}
