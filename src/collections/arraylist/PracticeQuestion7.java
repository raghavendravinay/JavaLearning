package collections.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * This program is to print the count of unique numbers from arraylist
 * @author RaghavendraVinayM
 *
 */
public class PracticeQuestion7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		ArrayList<Integer> num = new ArrayList<>();
		int count = 0, k = 0;
		System.out.println("Enter ArrayList Size");
		int size = scanner.nextInt();
		System.out.println("enter values into ArrayList");
		for(int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
			temp.add(list.get(i));
		}


		for(int i = 0; i < size; i++) {
			count = 1;
			if(temp.get(i) != -1) {
				for(int j = i + 1; j < size; j++) {
					if(list.get(i) == list.get(j)) {
						++count;
						temp.set(j, -1);
					}
				}
				num.add(count);
			}
			count = 0;

		}
		
		for(int i = 0; i < temp.size(); i++) {
			if(temp.get(i) != -1)
				System.out.println(temp.get(i) + " occurs " + num.get(k++) + " time(s)");
		}
		scanner.close();
	}
}
