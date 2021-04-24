import java.util.Scanner;

public class MagicNumber {

	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rem, mag=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			mag=mag+rem;
			num=num/10;
			if(num==0 && mag>9) {
				num=mag;
				mag=0;
			}
		}
		if(mag==1) {
			System.out.println(temp+" is a Magic Number");
		}
		else {
			System.out.println(temp+" is not a Magic Number");
		}
	}
}
