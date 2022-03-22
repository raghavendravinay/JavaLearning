package seperateValues;

import java.util.Scanner;

public class DivideTheGivenValues {

	public static void main(String[] args) {

	String input = "1 fish 2 fish red fish blue fish green";
	Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
	System.out.println(s.nextInt());
	System.out.println(s.nextInt());
	System.out.println(s.next());
	System.out.println(s.next());
	System.out.println(s.next());
	
	System.out.println("New\n\n");
	String input2 = "25+6/2-5";
	Scanner sc = new Scanner(input2).useDelimiter("\\s*/\\s*");
	System.out.println(input2);
	System.out.println(sc.next());
	System.out.println(sc.next());
}}
