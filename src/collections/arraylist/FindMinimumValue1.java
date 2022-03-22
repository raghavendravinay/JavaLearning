package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMinimumValue1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter ArrayList size");
		int s = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		
		for( int i = 0; i < s; i++) {
			list.add(scanner.nextInt());
		}
		
		int min = list.get(s - 1);
		for(int i = 0; i < s; i++) {
			if(min > list.get(i))
			min = list.get(i);
		}
		System.out.println(min);
		scanner.close();
	}
}
