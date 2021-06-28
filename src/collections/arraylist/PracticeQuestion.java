package collections.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * This program is to allow user to enter values into ArrayList except 22.
 * if user added 22, program should stop and print ArrayList values exclude 22.
 * @author RaghavendraVinayM
 *
 */

public class PracticeQuestion {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		System.out.println("Enter Values into ArrayList");
		while(true) {
			list.add(scanner.nextInt());
			if(list.get(i) == 22) {
				break;
			}
			i++;
		}
		for(i = 0; i < list.size() - 1; i++) {
			System.out.println(list.get(i));
		}
		
		scanner.close();
	}
}
