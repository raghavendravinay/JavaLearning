package patterns;

import java.util.Scanner;

public class PyramidPattern4 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);				//	ex:num=5
		System.out.println("Enter a number:");			//				1
		int num=sc.nextInt();							//			   123
		for(int i=1; i<=num; i++) {						//			  12345
			for(int j=1;j<=num-i; j++) {				//			 1234567
				System.out.print(" ");					//			123456789
			}
			for(int k=1;k<2*i; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
	}

}
