package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program find whether the given arraylist is superArraylist or not
 * @author RaghavendraVinayM
 *
 */

public class PracticeQuestion3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int size, random, sum, i, j;
		i = j = 0;
		boolean superArrayList = false;
		System.out.println("Enter ArrayList size");
		size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		for(i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
		
		System.out.println("Enter random number");
		random = scanner.nextInt();
		
		for(i = 0; i < size; i++) {
			for(j = i+1; j < size; j++) {
				sum = list.get(i) + list.get(j);
				if(random == sum) {
					superArrayList = true;
					break;
				}
			}
		}
		
		if(superArrayList) {
			System.out.println("Super ArrayList");
		}
		else {
			System.out.println("Not a Super ArrayList");
		}
	scanner.close();
	}
}
