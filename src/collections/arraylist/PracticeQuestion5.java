package collections.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class PracticeQuestion5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		int size, i, j, count = 0;
		System.out.println("Enter ArrayList size");
		size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		for(i = 0; i < size; i++) {
			list.add(scanner.nextInt());
			temp.add(list.get(i));
		}
		
		for(i = 0; i < size; i++) {
			if(temp.get(i) != -1) {
			for(j = i + 1; j < size; j++) {
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
		scanner.close();
	}
}
