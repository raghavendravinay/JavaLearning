import java.util.Scanner;

/**
 * This program is to find whether the given number is a Palindrome or not
 * 
 * @author RaghavendraVinayM
 *
 */
public class Palindrome {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();

		if (num == isPalindrome(num)) {
			System.out.println(num + " is a Palindrome number");
		} else {
			System.out.println(num + " is not a Palindrome Number");
		}
		scanner.close();
	}

	public static int isPalindrome(int num) {
		int rem, rev = 0;

		while (num > 0) {
			rem = num % 10;
			rev = (10 * rev) + rem;
			num = num / 10;
		}
		return rev;
	}
}
