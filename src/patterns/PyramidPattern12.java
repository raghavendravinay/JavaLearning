package patterns;

import java.util.Scanner;

public class PyramidPattern12 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		for(int i=num; i>=0;i--) {
			for(int j=i; j<=num; j++) {					//		Ex: num=3
				System.out.print(j+" ");				//		3
			}											//		2 3
			System.out.println(" ");					//		1 2 3
		}												//		0 1 2 3
		for(int k=1; k<=num; k++) {						//		1 2 3
			for(int l=k; l<=num; l++) {					//		2 3
				System.out.print(l+" ");				//		3
			}
			System.out.println(" ");
		}
	}
}
