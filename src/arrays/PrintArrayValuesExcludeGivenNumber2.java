package arrays;

import java.util.Scanner;

public class PrintArrayValuesExcludeGivenNumber2 {

	//Read values into array and stop when the value is 22. And print values from array exclude 22
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[1000];
		int i=0, n;
		System.out.println("Enter values into array");
		while(true) {
			arr[i]=sc.nextInt();
			if(arr[i]==22) {
				n=i;
				break;
			}
			i++;
		}
		for(int j=0; j<n; j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
