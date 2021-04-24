import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int add=0;
		for(int i=1; i<=num/2; i++) {
			if(num%i==0) {
				add=add+i;
			}
		}
		if(num==add) {
			System.out.println(num+" is a perfect number");
		}
		else {
			System.out.println(num+ " is not a perfect number");
		}
	}
}
