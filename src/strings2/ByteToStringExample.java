package strings2;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] b = { 74, 97, 118, 97 };
		String s = new String(b);
		System.out.println(s);
	}
}
