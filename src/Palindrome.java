import java.util.Scanner;

public class Palindrome {

	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt(); 
				int rem, rev=0;
		int temp=num;
		while(temp>0) {
			rem=temp%10;
			rev=(10*rev)+rem;
			temp=temp/10;
		}
		if(num==rev) {
		System.out.println(num+" is a Palindrome number");
		}
		else {
			System.out.println(num +" is not a Palindrome Number");
		}
	}
}
