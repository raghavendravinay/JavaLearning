import java.util.Scanner;

/**
 * This program is to find the given number is Armstrong Number or not? 
 * @author RaghavendraVinayM
 *
 */

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		
		if(isArmstrong(num)) {
			System.out.println("Given value is an Armstrong number");
		}
		else {
			System.out.println("Given value is not an Armstrong Number");
		}
		
		int temp = armstrongNumber(num);
		
		if(num == temp) {
			System.out.println("Given value is an Armstrong number");
		}
		else {
			System.out.println("Given value is not an Armstrong Number");
		}
		scanner.close();
	}

	public static boolean isArmstrong(int num) {
		int temp = num;
		int rem;
		int add = 0;
		while(num > 0) {
			rem = num % 10;
			add = add + (rem * rem * rem);
			num = num / 10;
		}
		if(temp == add) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int armstrongNumber(int num) {
		int rem;
		int add = 0;
		while(num > 0) {
			rem = num % 10;
			add = add + (rem * rem * rem);
			num = num / 10;
		}
		return add;
	}
}
