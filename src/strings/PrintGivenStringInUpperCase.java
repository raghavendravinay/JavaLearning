package strings;
import java.util.Scanner;
public class PrintGivenStringInUpperCase {

	public static void main(String []args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String string = scanner.nextLine();
		System.out.println("Your name is "+string.toUpperCase());
		scanner.close();
	}
}
