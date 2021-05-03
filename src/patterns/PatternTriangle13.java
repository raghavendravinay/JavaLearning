package patterns;

import java.util.Scanner;

public class PatternTriangle13 {

	public static void main(String[] args) {	//	ex:num=5
		Scanner sc=new Scanner(System.in);		//	55555
		System.out.println("Enter a Number");	//	 4444
		int num=sc.nextInt();					//	  333
		for(int i=num; i>0; i--) {				//	   22
			for(int j=i; j<num; j++) {			//		1
				System.out.print(" ");
			}
			for(int k=i; k>0; k--) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
