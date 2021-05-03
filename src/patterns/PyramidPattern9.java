package patterns;

import java.util.Scanner;

public class PyramidPattern9 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");		//	ex: num=5
		int num=sc.nextInt();						//	999999999
		for(int i=num; i>0; i--) {					//	 7777777
			for(int j=1; j<=num-i; j++) {			//	  55555
				System.out.print(" ");				//	   333
			}										//		1
			for(int k=1; k<2*i; k++) {
				System.out.print((2*i)-1);
			}
			System.out.println("");
		}
	}
}
