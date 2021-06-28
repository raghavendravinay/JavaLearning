package arrays;

import java.util.Scanner;
/**
 * This program will print the largest number from the given numbers until you enter -1
 * @author RaghavendraVinayM
 *
 */
public class FindLargeNumberFromGivenNumbers {

	public static void main(String[] args) {

		approach1();
		approach2();
		approach3();
		approach4();
		approach5();
		approach6();
		approach7();
		approach8();
		approach9();
	}

	public static void approach1() 
	{		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter values");
		int max = Integer.MIN_VALUE;
		for(; ;) 
		{
			int num = scanner.nextInt();
			if(num == -1) 
			{
				break;
			}
			if(max < num) 
			{
				max = num;
			}
		}
		System.out.println(max);
	}

	public static void approach2() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Values");
		int max = Integer.MIN_VALUE;
		while(true) 
		{
			int num = scanner.nextInt();
			if(num == -1) 
			{
				break;
			}
			if(max < num) 
			{
				max = num;
			}
		}
		System.out.println(max);
	}

	public static void approach3()
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter values");
		int max = Integer.MIN_VALUE;
		do {
			int num = scanner.nextInt();
			if(num == -1) 
			{
				break;
			}
			if(max < num) 
			{
				max = num;
			}
		}while(true);
		System.out.println(max);
	}
	public static void approach4() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values");
		int num = scanner.nextInt();
		int max = Integer.MIN_VALUE;
		for(; num != -1 ;) {
			num = scanner.nextInt();
			if(max < num)
				max = num;
		}
		System.out.println(max);
	}
	public static void approach5() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values");
		int num = scanner.nextInt();
		int max = Integer.MIN_VALUE;
		while(num != -1) {
			num = scanner.nextInt();
			if(max < num)
				max = num;
		}
		System.out.println(max);
	}
	public static void approach6() {
	
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values");
		int max = Integer.MIN_VALUE;
		int num;
		do{
			 num = scanner.nextInt();
			if(max < num)
				max = num;
		}while(num != -1);
		System.out.println(max);
	}
	
	public static void approach7() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values");
		int num = scanner.nextInt();
		int max = Integer.MIN_VALUE;
		for( ; num != -1; ) {
			
			if(max < num && num != -1)
				max = num;
			num = scanner.nextInt();
		}
		System.out.println(max);		
	}
	
	public static void approach8() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values");
		int num = scanner.nextInt();
		int max = Integer.MIN_VALUE;
		while(num != -1){
			
			if(max < num && num != -1) {
				max = num;
			}
			num = scanner.nextInt();
		}
		System.out.println(max);
	}
	
	public static void approach9() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter values");
		int max = Integer.MIN_VALUE;
		int num = scanner.nextInt();
		do{
			
			if(max < num && num != -1)
				max = num;
			num = scanner.nextInt();
		}while(num != -1);
		System.out.println(max);
	}
}
