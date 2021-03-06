package patterns;

import java.util.Scanner;

/**
 * This program is to print the Triangle Pattern
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle10 {

	public static void main(String[] args) {				//	ex: num=5
		Scanner scanner = new Scanner(System.in);			//	5 4 3 2 1
		System.out.println("Enter a Number:");				//	5 4 3 2
		int num = scanner.nextInt();						//  5 4 3 
		for(int i = num; i > 0; i--) {						//	5 4
			for(int j = num; j > num - i; j--) {			//	5
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		scanner.close();
	}
}
