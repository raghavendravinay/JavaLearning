package patterns;

import java.util.Scanner;

public class PatternTriangle10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		for(int i=num; i>0; i--) {
			for(int j=num; j>num-i; j--) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}
