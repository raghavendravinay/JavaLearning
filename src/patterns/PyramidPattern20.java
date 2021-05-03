package patterns;

import java.util.Scanner;

public class PyramidPattern20 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");		//	ex: num=5
		int num=sc.nextInt();						//	5 4 3 2 1
		for(int i=num; i>0; i--)					//   4 3 2 1
		{											//	  3 2 1
			for(int j=i; j<num; j++)				//	   2 1
			{										//		1
				System.out.print(" ");
			}
			for(int k=i; k>0; k--) 
			{
				System.out.print(k+" ");
			}
			System.out.println(" ");
		}
	}
}
