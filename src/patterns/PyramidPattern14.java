package patterns;

import java.util.Scanner;

public class PyramidPattern14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		for(int i=num/2; i>=0; i--) {
			for(int j=i-1; j>=0; j--) {
				System.out.print(" ");
			}
			for(int k=num/2; k>=i; k--) {
				System.out.print(k);
			}
			System.out.println("");
		}
		for(int l=0; l<=num/2; l++) {
			for(int m=l; m>=0; m--) {
				System.out.print(" ");
			}
			for(int n=num/2; n>l; n--) {
				System.out.print(n);
			}
			System.out.println("");
		}
		
	}
}
