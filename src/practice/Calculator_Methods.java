package practice;

public class Calculator_Methods {

	double r;
	char c;

	public double calculator(double d1, char ch, double d2) {
		char c = ch;
		switch (c) {
		case '+':
			r = d1 + d2;
			return r;
		case '-':
			r = d1 - d2;
			return r;

		case '*':
			r = d1 * d2;
			return r;

		case '/':
			r = d1 / d2;
			return r;

		default:
			System.out.println("wrong inputs.");
			return r;
		}
	}
}
