package patterns;

import java.util.Scanner;

public class PyramidPattern18 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		for(int i=num; i>0; i--)
		{
			for(int j=i; j<=num; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
