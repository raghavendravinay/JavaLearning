package collections.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class FindMaximumValue2_UsingMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter ArrayList size");
		int size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		addValuesIntoArrayList(list, size);
		findMaximumNumber(list);	
		scanner.close();
	}
	public static void addValuesIntoArrayList(ArrayList<Integer> list, int size) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for( int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
	}
	public static void findMaximumNumber(ArrayList<Integer> list) {
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < list.size(); i++) {
			if(max < list.get(i))
			max = list.get(i);
		}
		System.out.println(max);
	}
}
