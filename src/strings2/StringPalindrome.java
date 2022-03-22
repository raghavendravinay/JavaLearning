package strings2;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		String original = null;
		String rev = "";
		System.out.println("Enter string to reverse");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		for (int i = (original.length()) - 1; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}
		if (original.equalsIgnoreCase(rev)) {
			System.out.println("Given String is a palindrome");
		} else {
			System.out.println("Given String is not a palindrome");
		}
		sc.close();
	}
}
