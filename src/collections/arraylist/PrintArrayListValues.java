package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintArrayListValues {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<>();
	System.out.println("Enter ArrayList size");
	int size = scanner.nextInt();
	System.out.println("Enter values into ArrayList");
	for (int i = 0; i < size; i++) {
		list.add(scanner.nextInt());
	}
	System.out.println("Values in ArrayList are: ");
	for (int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i) + " ");
	}
	scanner.close();
	}
}
