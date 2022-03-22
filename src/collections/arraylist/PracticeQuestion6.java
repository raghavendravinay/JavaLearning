package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeQuestion6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		System.out.println("Enter ArrayList Size");
		int size = scanner.nextInt();
		System.out.println("enter values into ArrayList");
		for(int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		for(int i = 0; i < size; i++) {
			if(list.get(i) == num) {
				temp.add(i);
			}

		}
		System.out.println("given number found at " + temp.size() + " indexes i.e.,");
		for(int i = 0; i < temp.size(); i++) {
			System.out.print(temp.get(i) + " ");
		}
		scanner.close();
	}
}
