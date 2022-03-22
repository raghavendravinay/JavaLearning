package strings2;

import java.util.Scanner;

public class CityNameStringFunction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your city name");
//		String cityName=sc.nextLine();
//		String cityName=sc.nextLine().toLowerCase();
		String cityName = scanner.nextLine().toLowerCase().trim();

		// trim() - purpose of the trim() is to remove any spaces at beginning or ending
		// of the String
		// trim method will not remove spaces a middle of the String
		if (cityName.equals("hyderabad")) {
			System.out.println("Hello Hyderabadi, Aadaab...");
		} else if (cityName.equals("chennai")) {
			System.out.println("Hello Madrasi, vanakkam...");
		} else if (cityName.equals("banglore")) {
			System.out.println("Hello Kannadiga, namaskar...");
		} else {
			System.out.println("Enter valid city name");
		}
		scanner.close();
	}
}
