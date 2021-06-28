package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program is to allow user to enter values into ArrayList except 22.
 * if user added 22, program should not add it into ArrayList and print ArrayList.
 * @author RaghavendraVinayM
 *
 */

public class PracticeQuestion2_UsingMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter ArrayList size");
		int size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		EnterValuesIntoArrayList(list, size);
		printValues(list);
		scanner.close();
	}

	public static void EnterValuesIntoArrayList(ArrayList<Integer> list, int size) {

		int i = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while(i < size) {
			list.add(scanner.nextInt());
			if(list.get(i) == 22) {
				list.remove(i);
				i--;
			}
			i++;
		}
	}
	public static void printValues(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
