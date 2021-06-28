package strings;
import java.util.Scanner;

public class FindCountOfIndividualWords_UisngMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		String s1[] = new String[size];
		String s2[] = new String[size];
		int num[] = new int[size];
		System.out.println("Enter a " + size + " word sentence");
		addValuesIntoString(s1, s2);
		countOfIndividualElement(s2, num);
		
		scanner.close();
	}
	public static void addValuesIntoString(String s1[], String s2[]) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < s1.length; i++) {
			s1[i] = scanner.next();
			s2[i] = s1[i];
		}
	}
	public static void countOfIndividualElement(String s2[], int num[]) {
		
		int count = 0, k = 0;
		for(int i = 0; i < s2.length; i++) {
			count = 1;
			if(!s2[i].equals("-1")) {
				for(int j = i + 1; j < s2.length; j++) {
					if(s2[i].equals(s2[j])) {
						s2[j] = "-1";
						++count;
					}
				}
				num[k++] = count;
			}
		}
		
		k = 0;
		for(int i = 0; i < s2.length; i++) {
			if(!s2[i].equals("-1")) {
			System.out.println(s2[i] + " occurs " + num[k++] + " time(s)");
		}
		}
	}
}
