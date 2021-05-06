package arrays;

import java.util.Scanner;

public class PrintArrayValuesExcludeGivenNumber4 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int n=sc.nextInt(); 
		int i=0;
		int arr[]=new int[n];
		System.out.println("Enter values into array");
		while(i<n) {
			
			arr[i]=sc.nextInt(); 
			if(arr[i]!=22) {
				i++;
			}
			 /* if(arr[i]==22) {
			 * 
			 * } else { i++; }
			 */
		}
		for(int j=0; j<n; j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
