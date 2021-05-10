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
//		approach2();
//		approach3();
//		approach4();
//		approach5();
//		approach6();
//		approach7();
//		approach8();
//		approach9();
	}

	public static void approach1() 
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		int max=Integer.MIN_VALUE;
		for(; ;) 
		{
			int num=sc.nextInt();
			if(num==-1) 
			{
				break;
			}
			if(max<num) 
			{
				max=num;
			}
		}
		System.out.println(max);
	}

	public static void approach2() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Values");
		int max=Integer.MIN_VALUE;
		while(true) 
		{
			int num=sc.nextInt();
			if(num==-1) 
			{
				break;
			}
			if(max<num) 
			{
				max=num;
			}
		}
		System.out.println(max);
	}

	public static void approach3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values");
		int max=Integer.MIN_VALUE;
		do {
			int num=sc.nextInt();
			if(num==-1) 
			{
				break;
			}
			if(max<num) 
			{
				max=num;
			}
		}while(true);
		System.out.println(max);
	}
	public static void approach4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		int num=sc.nextInt();
		int max=Integer.MIN_VALUE;
		for(;num!=-1;) {
			num=sc.nextInt();
			if(max<num)
				max=num;
		}
		System.out.println(max);
	}
	public static void approach5() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		int num=sc.nextInt();
		int max=Integer.MIN_VALUE;
		while(num!=-1) {
			num=sc.nextInt();
			if(max<num)
				max=num;
		}
		System.out.println(max);
	}
	public static void approach6() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		int max=Integer.MIN_VALUE;
		int num;
		do{
			 num=sc.nextInt();
			if(max<num)
				max=num;
		}while(num!=-1);
		System.out.println(max);
	}
	public static void approach7() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		int num=sc.nextInt();
		int max=Integer.MIN_VALUE;
		for(;num!=-1;) {
			
			if(max<num && num!=-1)
				max=num;
			num=sc.nextInt();
		}
		System.out.println(max);		
	}
	public static void approach8() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		int num=sc.nextInt();
		int max=Integer.MIN_VALUE;
		while(num!=-1){
			
			if(max<num && num!=-1) {
				max=num;
			}
			num=sc.nextInt();
		}
		System.out.println(max);
	}
	public static void approach9() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values");
		int max=Integer.MIN_VALUE;
		int num=sc.nextInt();
		do{
			
			if(max<num && num!=-1)
				max=num;
			num=sc.nextInt();
		}while(num!=-1);
		System.out.println(max);
	}
}
