package patterns;

import java.util.Scanner;

public class SquarePattern10 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any odd number:");
		int num=sc.nextInt();
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=num; j++)
			{
				if(i==(num+1)/2 || j==(num+1)/2)
				{
					System.out.print("O ");
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.println(" ");
		}
	}
}
