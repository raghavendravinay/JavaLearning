package patterns;

import java.util.Scanner;

public class PyramidPattern10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		for(int i=1; i<=(num+1)/2; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int k=num/2; k>0; k--) {
			for(int l=1; l<=k; l++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
