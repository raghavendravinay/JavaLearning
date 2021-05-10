package arrays;

import java.util.Scanner;

public class MinValueOfArray2 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter values into array");
	for(int i=0; i<n; i++){
		arr[i]=sc.nextInt();
	}
	int min=Integer.MAX_VALUE;
	for(int i=n-1; i>=0; i--)
	{
	if(min>arr[i]) {
		min=arr[i];
	}
	}
	System.out.println(min);
	}
}
