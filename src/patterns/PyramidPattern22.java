package patterns;

import java.util.Scanner;

public class PyramidPattern22 {

	public static void main(String[] args) {		//		ex:num=5
		Scanner sc=new Scanner(System.in);			//			1
		System.out.println("Enter a number:");		//		   2 2
		int num=sc.nextInt();						//		  3 3 3
		for(int i=1; i<=num; i++) {					//		 4 4 4 4
			for(int j=1; j<=num-i; j++) {			//		5 5 5 5 5
				System.out.print(" ");				//		 4 4 4 4
			}										//		  3 3 3
			for(int k=1; k<=i; k++) {				//		   2 2
				System.out.print(i+" ");			//			1
			}
			System.out.println("");
		}
		for(int l=1; l<=num; l++) {
			for(int m=1; m<=l; m++) {
				System.out.print(" ");
			}
			for(int n=num-l; n>0; n--) {
				System.out.print(n+" ");
			}
			System.out.println("");
		}
	}
}
