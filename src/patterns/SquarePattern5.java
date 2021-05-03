package patterns;

import java.util.Scanner;

public class SquarePattern5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1; i<=num; i++) 
		{
			for(int j=1; j<=num; j++)
			{
				if(i==j)
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
