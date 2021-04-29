package patterns;

import java.util.Scanner;

public class PyramidPattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();

		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<2*i; k++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}
}
