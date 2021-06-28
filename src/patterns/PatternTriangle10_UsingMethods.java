package patterns;

import java.util.Scanner;

/**
 * This program is to print the Triangle Pattern
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle10_UsingMethods {

	public static void main(String[] args) {				
		Scanner scanner = new Scanner(System.in);			
		System.out.println("Enter a Number:");				
		int num = scanner.nextInt();		//	ex: num=3	 
		printPatternTriangle10(num);		// 3 2 1
											// 3 2 
		scanner.close();					// 3
	}
	
	public static void printPatternTriangle10(int num) {
		
		for(int i = num; i > 0; i--) {						
			for(int j = num; j > num - i; j--) {	
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
}
