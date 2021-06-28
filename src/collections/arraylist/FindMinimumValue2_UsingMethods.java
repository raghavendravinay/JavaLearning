package collections.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class FindMinimumValue2_UsingMethods {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter ArrayList size");
		int s = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		addValuesIntoArrayList(list, s);
		findMinimumNumber(list, s);		
		scanner.close();
	}
	public static void addValuesIntoArrayList(ArrayList<Integer> list, int s) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);	
		for( int i = 0; i < s; i++) {
			list.add(scanner.nextInt());
		}
	}
	public static void findMinimumNumber(ArrayList<Integer> list, int s) {

		int min = Integer.MAX_VALUE;
		for(int i = 0; i < s; i++) {
			if(min > list.get(i))
				min = list.get(i);
		}
		System.out.println(min);
	}
}
