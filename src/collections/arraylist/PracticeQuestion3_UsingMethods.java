package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program find whether the given arraylist is superArraylist or not
 * @author RaghavendraVinayM
 *
 */

public class PracticeQuestion3_UsingMethods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int size, random;
		System.out.println("Enter ArrayList size");
		size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		addValuesIntoArrayList(size, list);

		System.out.println("Enter random number");
		random = scanner.nextInt();


		if(isSuperArrayLsit(size, list, random)) {
			System.out.println("Super ArrayList");
		}
		else {
			System.out.println("Not a Super ArrayList");
		}
		scanner.close();
	}
	public static void addValuesIntoArrayList(int size, ArrayList<Integer> list) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
	}
	public static boolean isSuperArrayLsit(int size, ArrayList<Integer> list, int random) {
		
		int sum = 0;
		boolean superArrayList = false;
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; j++) {
				sum = list.get(i) + list.get(j);
				if(random == sum) {
					superArrayList = true;
					break;
				}
			}
		}
		return superArrayList;
	}
}
