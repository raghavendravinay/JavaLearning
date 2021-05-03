package patterns;

import java.util.Scanner;

public class PyramidPattern13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		for(int i=(num+1)/2; i>0; i--) {
			for(int j=i-1; j>0; j--) {				//ex: num=7
				System.out.print(" ");				//			*
			}										//		   **	
			for(int k=i; k<=(num+1)/2; k++) {		//		  ***
				System.out.print("*");				//		 ****
			}										//		  ***
			System.out.println("");					//		   **
		}											//          *
		for(int l=num/2;l>0; l--) {
			for(int m=l; m<=num/2;m++) {
				System.out.print(" ");
			}
			for(int n=l; n>0; n--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
