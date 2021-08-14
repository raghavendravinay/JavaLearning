package practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		double d1 = scanner.nextDouble();
		System.out.println("Enter '+' or '-' or '/' or '*'");
		char ch = scanner.next().charAt(0);
		System.out.println("Enter second number");
		double d2 = scanner.nextDouble();
		Calculator_Methods cm = new Calculator_Methods();
		System.out.println(cm.calculator(d1, ch, d2));
		scanner.close();
	}
}
