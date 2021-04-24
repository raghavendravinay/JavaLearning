import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int num=sc.nextInt();
		int first=0; 
		int second=1;
		int third;
		System.out.println(first);
		System.out.println(second);
		while(num-->0) {
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
		}
		
	}
}
