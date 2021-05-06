package arrays;

import java.util.Scanner;

public class PrintArrayValuesExcludeGivenNumber3 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int n=sc.nextInt(); 
		int arr[]=new int[n];
		System.out.println("Enter values into array");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==22) {
				System.out.println("22 is not accepting. enter another number");
				i--;
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
