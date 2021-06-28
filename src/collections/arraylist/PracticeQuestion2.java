package collections.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * This program is to allow user to enter values into ArrayList except 22.
 * if user added 22, program should not add it into ArrayList and print ArrayList.
 * @author RaghavendraVinayM
 *
 */

public class PracticeQuestion2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int size, i = 0;
		System.out.println("Enter ArrayList size");
		size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		while(i < size) {
			list.add(scanner.nextInt());
			if(list.get(i) == 22) {
				list.remove(i);
				i--;
			}
			i++;
		}
		for(i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		scanner.close();
	}
}
