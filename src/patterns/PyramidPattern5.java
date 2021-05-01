package patterns;

import java.util.Scanner;

public class PyramidPattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			for(int k=(2*i)-1; k>0; k--) {
				System.out.print(k);
			}
			System.out.println("  ");
		}
	}
}
