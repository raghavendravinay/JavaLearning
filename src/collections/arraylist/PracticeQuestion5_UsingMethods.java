package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeQuestion5_UsingMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		int size, count = 0;
		System.out.println("Enter ArrayList size");
		size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		addValuesIntoArrayList(list, temp, size);
		countOfThePairs(size, temp, count);
		
		scanner.close();
	}
	public static void addValuesIntoArrayList(ArrayList<Integer> list, ArrayList<Integer> temp, int size) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
			temp.add(list.get(i));
		}
	}
	public static void countOfThePairs(int size, ArrayList<Integer> temp, int count) {
		
		for(int i = 0; i < size; i++) {
			if(temp.get(i) != -1) {
			for(int j = i + 1; j < size; j++) {
				if(temp.get(i) == temp.get(j)) {
					++count;
					temp.remove(j);
					temp.add(-1);
					break;
				}
					
				}
			}
		}
		System.out.println(count + " no of pairs formed with the given ArrayList");
		
	}
}
