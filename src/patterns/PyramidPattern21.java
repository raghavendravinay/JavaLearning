package patterns;

import java.util.Scanner;

public class PyramidPattern21 {

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();					//	int num=5
		for( int i=1; i<=num; i++)				//			*
		{										//		   * *
			for(int j=1; j<=num-i; j++)			//		  * * *
			{									//		 * * * *
				System.out.print(" ");			//		* * * * *
			}									//		 * * * *
			for(int k=1; k<=i; k++)				//		  * * *
			{									//		   * *
				System.out.print("* ");			//			*
			}
			System.out.println(" ");
		}
		for(int l=1; l<num; l++)
		{
			for(int m=1; m<=l; m++) {
				System.out.print(" ");
			}
			for(int n=1; n<=num-l; n++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
