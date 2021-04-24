import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rem;
		int add=0;
		int temp = num;
		while(num>0) {
			rem=num%10;
			add=add+(rem*rem*rem);
			num=num/10;
		}
		if(temp==add) {
			System.out.println(temp+" is an Armstrong Number");
		}
		else {
			System.out.println(temp+" is not an Armstrong Number");
		}
	}
}
