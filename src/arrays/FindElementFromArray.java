package arrays;
import java.util.Scanner;

public class FindElementFromArray {

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the array");
		int n=sc.nextInt();
		System.out.println("Length of the array is: "+n);
		System.out.println("Enter values in array");
		int arr[]=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a value");
		int num=sc.nextInt();
		for(int j=0; j<arr.length; j++) {
			if(arr[j]==num) {
				System.out.println("Given number was found in this array");
			}
		}
	}
}
