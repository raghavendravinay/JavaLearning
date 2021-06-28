package collections.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class FindMaximumValue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter ArrayList size");
		int size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		
		for( int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
		
		int max = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(max < list.get(i))
			max = list.get(i);
		}
		System.out.println(max);
		scanner.close();
	}
}
