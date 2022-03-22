package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program is to print the count of unique numbers from arraylist
 * @author RaghavendraVinayM
 *
 */
public class PracticeQuestion7_UsingMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		ArrayList<Integer> num = new ArrayList<>();
		System.out.println("Enter ArrayList Size");
		int size = scanner.nextInt();
		System.out.println("enter values into ArrayList");
		addValuesIntoArrayList(size, list, temp);
		countEachValue(size, temp, list, num);

		
		scanner.close();
	}
	public static void addValuesIntoArrayList(int size, ArrayList<Integer> list, ArrayList<Integer> temp ) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
			temp.add(list.get(i));
		}
	}
	public static void countEachValue(int size, ArrayList<Integer> temp, ArrayList<Integer> list,  ArrayList<Integer> num) {
	
		int count = 0, k = 0;
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
	}
}
