import java.util.Scanner;

/**
 * This program is to print the Fibonacci series
 * @author RaghavendraVinayM
 *
 */

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		long num=scanner.nextLong();
		long first = 0L;
		long second = 1L;
		
		printFibonacci(first, second, num);
		scanner.close();
	}
	
	public static void printFibonacci(long first, long second, long num) {
		
		long third;
		System.out.print(first + " ");
		System.out.print(second + " ");
		while(num-- > 0) {
			third = first + second;
			System.out.print(third + " ");
			first = second;
			second = third;
		}
		
	}

}
