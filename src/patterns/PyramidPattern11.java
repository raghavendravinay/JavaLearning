package patterns;

import java.util.Scanner;

/**
 * This program to print the pyramid pattern
 * @author RaghavendraVinayM
 *
 */

public class PyramidPattern11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scanner.nextInt();
		for(int i = num; i >= 0; i--) {
			for(int j = num; j >= i; j--) {								//		ex: num=3
				System.out.print(j + " ");								//		3
			}															//		3 2 
			System.out.println(" ");									//		3 2 1
		}																//		3 2 1 0
		for(int k = 1; k <= num; k++) {									//		3 2 1 
			for(int l = num; l >= k; l--) {								//		3 2
				System.out.print(l + " ");								//		3
			}
			System.out.println(" ");
		}
		scanner.close();
	}
}
