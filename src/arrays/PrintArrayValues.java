package arrays;
import java.util.Scanner;

public class PrintArrayValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the array");
		int n=sc.nextInt();
		System.out.println("Length of the array is: "+n);
		System.out.println("enter values");
		int arr[]=new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("data in array are: ");
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
