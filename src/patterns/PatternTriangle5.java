package patterns;
import java.util.Scanner;

/**
 * This program to print the pattern triangle
 * @author RaghavendraVinayM
 *
 */

public class PatternTriangle5 {

	public static void main(String[] args) {	
													//	ex: num=5
		Scanner scanner = new Scanner(System.in);	//	1 
		System.out.println("Enter a number:");		//	2 2
		int num = scanner.nextInt();				//	3 3 3
		for(int i = 1; i <= num; i++) {				//	4 4 4 4
			for(int j = 1; j <= i; j++) {			//	5 5 5 5 5
				System.out.print(i + " ");
			}
			System.out.println("");
		}
		scanner.close();
	}
}
