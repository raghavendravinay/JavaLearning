package arrays;

import java.util.Scanner;

public class MaxValueOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter values into array");
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0; i<n-1; i++)
		{
		if(max<arr[i+1]) {
			max=arr[i+1];
		}
		}
		System.out.println(max);
		}
}
