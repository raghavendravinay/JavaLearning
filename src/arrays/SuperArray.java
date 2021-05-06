package arrays;

import java.util.Scanner;

public class SuperArray {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		boolean superArray=false;
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values into array");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a random number");
		int num=sc.nextInt();
		while(n-1>0) {
			for(int i=0; i<n-1;i++) {
				if((arr[i]+arr[n-1])==num) {
					superArray=true;
					break;
				}
			}
			n--;
		}
		if(superArray) {
			System.out.println("Super array");
		}
		else {
			System.out.println("Not a Super Array");
		}
	}
}
