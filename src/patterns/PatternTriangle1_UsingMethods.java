package patterns;

import java.util.Scanner;

/**
 * This program is to print the triangle pattern
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle1_UsingMethods {

	public static void main(String[] args) {		
		
		Scanner scanner = new Scanner(System.in);			
		System.out.println("Enter a number:");				
		int num = scanner.nextInt();				//	ex: num=5		
		printPatternTriangle1(num);					//	*
													//  * *
		scanner.close();							//	* * *
	}
	
	public static void printPatternTriangle1(int num) {
		
		for(int i = 1; i <= num; i++) {						
			for(int j = 1; j <= i; j++) {					
				System.out.print("* ");				
			}
			System.out.println("");
		}
	}
}
