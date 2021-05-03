package patterns;

import java.util.Scanner;

public class PyramidPattern3 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");		//		ex:5
		int num=sc.nextInt();						//			1
		for(int i=1; i<=num; i++) {					//		   333
			for(int j=1; j<=num-i; j++) {			//		  55555
				System.out.print(" ");				//		 7777777
			}										//		999999999
			for(int k=1; k<2*i; k++) {
				System.out.print((2*i)-1);
			}
			System.out.println("");
		}
	}
}
