package patterns;
import java.util.Scanner;

/**
 * This program to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle5_UsingMethods {

	public static void main(String[] args) {	
													//	ex: num=5
		Scanner scanner = new Scanner(System.in);	//	1 
		System.out.println("Enter a number:");		//	2 2
		int num = scanner.nextInt();				//	3 3 3
		printPatternTriangle(num);					//	4 4 4 4
		scanner.close();							//	5 5 5 5 5
	}
	public static void printPatternTriangle(int num) {

		for(int i = 1; i <= num; i++) {				
			for(int j = 1; j <= i; j++) {			
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}
}
