import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		Long num=sc.nextLong();
		Long first=0L;
		Long second=1L;
		Long third;
		System.out.print(first+" ");
		System.out.print(second+" ");
		
		while(num-->0) {
			third=first+second;
			System.out.print(third+" ");
			first=second;
			second=third;
		}
	}
}
