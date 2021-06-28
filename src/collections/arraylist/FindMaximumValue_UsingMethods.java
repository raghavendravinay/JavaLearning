package collections.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class FindMaximumValue_UsingMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter ArrayList size");
		int size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		enterValuesIntoArrayList(size, list);
		findMaximumNumber(list);		
		scanner.close();
	}
	public static void enterValuesIntoArrayList(int size, ArrayList<Integer> list) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for( int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
	}
	public static void findMaximumNumber(ArrayList<Integer> list) {
		
		int max = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(max < list.get(i))
			max = list.get(i);
		}
		System.out.println(max);
	}
}
