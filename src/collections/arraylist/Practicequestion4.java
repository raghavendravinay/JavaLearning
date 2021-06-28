package collections.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class Practicequestion4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int size, a1, a2, a3, a4, a5, a6, a7, a8, a9, i;
		i = a1 = a2 = a3 = a4 = a5 = a6 = a7 = a8 = a9 = 0;
		System.out.println("Enter ArrayList Size");
		size = scanner.nextInt();
		System.out.println("Enter values into ArrayList");
		
		while(i < size){
			list.add(scanner.nextInt());
			if(list.get(i) == 10) {
				a1++;
				}
			else if(list.get(i) == 20) { 
				a2++;
			}
			else if(list.get(i) == 30) {
				a3++;
				}
			else if(list.get(i) == 40) { 
				a4++;
				}
			else if(list.get(i) == 50) {
				a5++;
				}
			else if(list.get(i) == 60) {
				a6++;
				}
			else if(list.get(i) == 70) {
				a7++;
				}
			else if(list.get(i) == 80) {
				a8++;
				}
			else if(list.get(i) == 90) {
				a9++;
				}
			else {
				list.remove(i);
				i--;
			}
			i++;
		}
		if(a1 > 0)
			System.out.println("10 occurs " + a1 + "times");
		if(a2 > 0)
			System.out.println("20 occurs " + a2 + "times");
		if(a3 > 0)
			System.out.println("30 occurs " + a3 + "times");
		if(a4 > 0)
			System.out.println("40 occurs " + a4 + "times");
		if(a5 > 0)
			System.out.println("50 occurs " + a5 + "times");
		if(a6 > 0)
			System.out.println("60 occurs " + a6 + "times");
		if(a7 > 0)
			System.out.println("70 occurs " + a7 + "times");
		if(a8 > 0)
			System.out.println("80 occurs " + a8 + "times");
		if(a9 > 0)
			System.out.println("90 occurs " + a9 + "times");
		scanner.close();
	}
}
