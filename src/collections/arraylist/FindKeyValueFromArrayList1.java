package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program is to find the key value in the ArrayList
 * @author RaghavendraVinayM
 *
 */

public class FindKeyValueFromArrayList1 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int key;
		System.out.println("Enter ArrayList size");
		int size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		for(int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
		System.out.println("Enter a key value to find from ArrayList");
		key = scanner.nextInt();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == key) {
				System.out.println("The given value was found in the ArrayList");
				break;
			}
		}
		scanner.close();
	}
	
}
