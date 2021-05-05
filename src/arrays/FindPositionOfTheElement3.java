package arrays;
import java.util.Scanner;
public class FindPositionOfTheElement3 {

	//find the position of a given number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println("Length of the array is "+n);
		int arr[]=new int[n];
		int arr2[]=new int[n];
		System.out.println("Add values into the array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number to find");
		int num=sc.nextInt();
		for(int j=0; j<arr.length; j++) {
			if(arr[j]==num) {
				arr2[j]=1;
			}
		}
		for(int k=0; k<arr2.length; k++) {
			if(arr2[k]==1) {
				n=k;
				System.out.print(++n+" ");
			}
		}
	}
}
