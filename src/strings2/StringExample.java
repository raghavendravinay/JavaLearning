package strings2;

public class StringExample {

	public static void main(String[] args) {
		String s1 = new String("You cannot change me");
		String s2 = new String("You cannot change me");
		System.out.println(s1 == s2);// false

		String s3 = "You cannot change me";
		System.out.println(s1 == s3);// false

		String s4 = "You cannot change me";
		System.out.println(s3 == s4);// true

		String s5 = "You cannot" + " change me";// you cannnot - constant and change me - constant... so at compile time
												// new object will be created in scp area
		System.out.println(s4 == s5);// true

		String s6 = "You cannot";
		String s7 = s6 + " chnage me"; // here s6 is a "variable" and change me is a "constant"... so at runtime new
										// object will be created in heap area
		System.out.println(s4 == s7);// false

		final String s8 = "You cannot"; // final means here s8 is constant value. we cannot change the s8.
		String s9 = s8 + " change me"; // here s8 is constant and change me is a "constant"... so at compile time new
										// object will be created in scp area
		System.out.println(s4 == s9);// true

	}
}
