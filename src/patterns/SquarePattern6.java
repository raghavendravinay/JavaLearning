package patterns;

import java.util.Scanner;

public class SquarePattern6 {

	//Prints 'O' at center of the square and 'X' at remaining places
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any odd number"); 		//	ex:5
		int num=sc.nextInt();								//	X X X X X
		for(int i=1; i<=num; i++)							//	X X X X X
		{													//	X X O X X
			for(int j=1; j<=num; j++) 						//	X X X X X
			{												//	X X X X X
				if(i==(num+1)/2 && j==(num+1)/2)
				{
					System.out.print("O ");
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.println("");
		}
	}
}
