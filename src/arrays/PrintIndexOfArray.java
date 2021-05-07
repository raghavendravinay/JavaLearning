package arrays;

import java.util.Scanner;

public class PrintIndexOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=0,l=0;
		System.out.println("Enter size of the array:");
		int n=sc.nextInt();
		System.out.println("Enter values into array");
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0; i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter searching number");
		int num=sc.nextInt();
		for(int j=0; j<n; j++) {
			if(arr1[j]==num) {
				arr2[k]=j;
				l=k;
				k++;
			}
		}
		System.out.println(k+"index(es) ");
		for(int i=0; i<=l; i++) {
			if(k>0) {
				System.out.print(arr2[i]+" ");
			}
			else {
				System.out.println("-1");
			}
		}
		
	}
}
