

import java.util.Scanner;

public class MagicNumberPattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number"); 
		int num=sc.nextInt();
		int rem,magic=0;
		while(num>9) {
			while(num>0) {
				rem=num%10;
				magic=magic+rem;
				num=num/10;
			}
			num=magic;
			magic=0;
		}
		if(num==1) {
			System.out.println("Given number is a magic number");
		}
		else {
			System.out.println("Given number is not a magic number");
		}
	}
}
