package patterns;

import java.util.Scanner;

public class PatternTriangle7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=num+1-i; j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}