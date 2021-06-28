package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program is to allow user to enter values into ArrayList except 22.
 * if user added 22, program should stop and print ArrayList values exclude 22.
 * @author RaghavendraVinayM
 *
 */

public class PracticeQuestion_UsingMethods {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter Values into ArrayList");
		addValuesIntoArrayList(list);
		printValues(list);
		scanner.close();
	}
	public static void addValuesIntoArrayList(ArrayList<Integer> list) {
		
		int i = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while(true) {
			list.add(scanner.nextInt());
			if(list.get(i) == 22) {
				break;
			}
			i++;
		}
	}
	public static void printValues(ArrayList<Integer> list) {
	
		for(int i = 0; i < list.size() - 1; i++) {
			System.out.println(list.get(i));
		}
		
	}
}
