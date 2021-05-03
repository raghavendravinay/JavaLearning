package patterns;

import java.util.Scanner;

public class PyramidPattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");		//ex:num=5
		int num=sc.nextInt();						//			1
		for(int i=1; i<=num; i++) {					//		   321
			for(int j=1; j<=num-i; j++) {			//		  54321
				System.out.print(" ");				//		 7654321
			}										//		987654321
			for(int k=(2*i)-1; k>0; k--) {
				System.out.print(k);
			}
			System.out.println("  ");
		}
	}
}
