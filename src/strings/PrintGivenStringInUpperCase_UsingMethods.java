package strings;
import java.util.Scanner;
public class PrintGivenStringInUpperCase_UsingMethods {

	public static void main(String []args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String string = scanner.nextLine();
		convertLowerToUpper(string);
		scanner.close();
	}
	public static void convertLowerToUpper(String string) {
		System.out.println("Your name is "+string.toUpperCase());
	}
}
