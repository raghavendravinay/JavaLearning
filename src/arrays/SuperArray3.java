package arrays;

import java.util.Scanner;

public class SuperArray3 {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		boolean superArray=false; int sum;
		System.out.println("Enter size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values into array");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a random number");
		int num=sc.nextInt();
		Stop:		//Labeled break
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				sum=arr[i]+arr[j];
				if(sum==num) {
					superArray=true;
					break Stop;
				}
			}
		}
			
		if(superArray) {
			System.out.println("Super array");
		}
		else {
			System.out.println("Not a Super Array");
		}
	}
}
