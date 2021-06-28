package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintArrayListValues_UsingMethods {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<>();
	System.out.println("Enter ArrayList size");
	int size = scanner.nextInt();
	System.out.println("Enter values into ArrayList");
	addValuesIntoArrayList(list, size);
	System.out.println("Values in ArrayList are: ");
	printValues(list, size);
	scanner.close();
	}
	public static void addValuesIntoArrayList(ArrayList<Integer> list, int size) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
	}
	public static void printValues(ArrayList<Integer> list, int size) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}	
	}
}
