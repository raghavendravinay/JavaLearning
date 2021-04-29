package patterns;

import java.util.Scanner;

public class PatternTriangle13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		for(int i=num; i>0; i--) {
			for(int j=i; j<num; j++) {
				System.out.print(" ");
			}
			for(int k=i; k>0; k--) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
