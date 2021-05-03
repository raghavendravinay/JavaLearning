package patterns;

import java.util.Scanner;

public class SquarePattern5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");		// ex: num=5
		int num=sc.nextInt();						// O X X X X
		for(int i=1; i<=num; i++) 					// X O X X X
		{											// X X O X X
			for(int j=1; j<=num; j++)				// X X X O X
			{										// X X X X O
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
