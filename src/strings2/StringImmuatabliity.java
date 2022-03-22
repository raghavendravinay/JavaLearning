package strings2;

public class StringImmuatabliity {

	public static void main(String[] args) {
		String s1 = new String("durga");
		String s2 = s1.toUpperCase();
		String s3 = s1.toLowerCase();
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		String s4 = "durga";
		String s5 = s1.toString();
		String s6 = s1.toLowerCase();
		String s7 = s1.toUpperCase();
		System.out.println(s4 == s5);
		System.out.println(s4 == s6);
		System.out.println(s4 == s7);
	}
}
