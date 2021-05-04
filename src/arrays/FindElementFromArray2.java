package arrays;
import java.util.Scanner;

public class FindElementFromArray2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the number");
		int n=sc.nextInt();
		System.out.println("Length of the array is "+n);
		int arr[] = new int[n];
		System.out.println("Enter values into array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number");
		int num=sc.nextInt();
		boolean found=false;
		for(int j=0; j<arr.length; j++) {
			if(arr[j]==num) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("Given number was found in the array");
		}
		else {
			System.out.println("Given number was not found in the array");
		}
	}
}
