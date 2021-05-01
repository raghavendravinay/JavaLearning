package patterns;

import java.util.Scanner;

public class PyramidPattern11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		for(int i=num/2; i>=0; i--) {
			for(int j=num/2; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		for(int k=1; k<=num/2; k++) {
			for(int l=num/2; l>=k; l--) {
				System.out.print(l+" ");
			}
			System.out.println(" ");
		}
	}
}
