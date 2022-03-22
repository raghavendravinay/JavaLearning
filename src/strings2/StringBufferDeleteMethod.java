package strings2;

public class StringBufferDeleteMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.delete(2, 5);
		System.out.println(sb);
		sb.insert(4, true);
		System.out.println(sb);

		sb.deleteCharAt(3);
		System.out.println(sb);
	}
}
