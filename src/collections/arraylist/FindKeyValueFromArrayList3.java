package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program is to find the presence of given key value in ArrayList
 * @author RaghavendraVinayM
 *
 */

public class FindKeyValueFromArrayList3 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int i, key;
		boolean found = false;
		System.out.println("Enter ArrayList size");
		int size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		for(i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
		
		System.out.println("Enter a key value");
		key = scanner.nextInt();
		
		for(i = 0; i < list.size(); i++) {
			if(list.get(i) == key) {
				found = true;
			}
		}
		
		if(found) {
			System.out.println(key + " is found");
		}
		else {
			System.out.println(key + " is not found");
		}
		scanner.close();
	}
}
