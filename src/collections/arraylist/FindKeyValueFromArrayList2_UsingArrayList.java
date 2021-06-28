package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program is to find the presence of given key value in ArrayList
 * @author RaghavendraVinayM
 *
 */
public class FindKeyValueFromArrayList2_UsingArrayList {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int key;
		System.out.println("Enter ArrayList size");
		int size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		addValuesIntoArrayList(list, size);
		System.out.println("Enter a key value");
		key = scanner.nextInt();
		
		if(isFound(list, key)) {
			System.out.println(key + " is found");
		}
		else {
			System.out.println(key + " is not found");
		}
		scanner.close();
	}
	public static void addValuesIntoArrayList(ArrayList<Integer> list, int size) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
	}
	public static boolean isFound(ArrayList<Integer> list, int key) {
		
		boolean found = false;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == key) {
				found = true;
				break;
			}
		}
		return found;
	}
}
