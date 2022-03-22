package strings2;

public class FinalEX {

	public static void main(String[] args) {
		final StringBuffer sb = new StringBuffer("Vinay");
		sb.append("Software");
		System.out.println(sb);// VinaySoftware
		// Even though we assign final to the StringBuffer still we can able to change
		// the StringBuffer object
		// so Using Final we cannot change the StringBuffer as Immutable
	}
}
