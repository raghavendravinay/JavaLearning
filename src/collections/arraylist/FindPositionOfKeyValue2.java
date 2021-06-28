package collections.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * This program is to find the position of the given key value from the ArrayList, when multiple values are present
 * @author RaghavendraVinayM
 *
 */
public class FindPositionOfKeyValue2 {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int i, key, size, n = 0;
		boolean found = false;
		System.out.println("Enter ArrayList size");
		size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		for(i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
		
		System.out.println("Enter a key value");
		key = scanner.nextInt();
		
		for (i = 0;  i< list.size(); i++) {
			if(list.get(i) == key) {
				n = i;
			found = true;	
			}
		}
		if(found) {
			System.out.println("Given key value " + key + " found at postion " + (++n) );
		}
		else {
			System.out.println("Given key value " + key + " is not found");
		}
		scanner.close();
	}
}
