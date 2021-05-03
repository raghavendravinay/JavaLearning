package patterns;

import java.util.Scanner;

public class PyramidPattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			//	ex:num=5
		System.out.println("Enter a number:");		//		*********
		int num=sc.nextInt();						//		 *******
		for(int i=num; i>0; i--) {					//		  *****
			for(int j=1; j<=num-i;j++) {			//		   ***
				System.out.print(" ");				//			*
			}
			for(int k=1; k<2*i; k++) {
				System.out.print("*");
			}
		System.out.println("");	
		}
	}
}
