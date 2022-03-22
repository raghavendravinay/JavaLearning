package strings2;

public class EqualOperatorExample {

	public static void main(String[] args) {
		String s1 = new String("Vinay");
		String s2 = s1.toUpperCase();
		String s3 = s1.toLowerCase();
		System.out.println(s1 == s2);
		System.out.println(s3 == s1);

		String s4 = "vinay";
		String s5 = s4.toString();
		String s6 = s4.toUpperCase();
		String s7 = s4.toLowerCase();
		System.out.println(s4 == s5);
		System.out.println(s1 == s6);
		System.out.println(s1 == s7);
	}
}
