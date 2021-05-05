package arrays;

import java.util.Scanner;

public class PrintArrayValuesExcludeGivenNumber {

	//Read values into array and stop when the value is 22. And print values from array exclude 22
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[1000];
		System.out.println("Enter values into array");
		for(int i=1;;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==22) {
				break;
			}
		}
		for(int i=1; ;i++) {
			if(arr[i]==22) {
				break;
			}
			System.out.print(arr[i]+" ");
		}
	}
}
