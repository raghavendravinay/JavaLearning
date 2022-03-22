package strings2;

public class InsertMethodExampleInStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.insert(2, "xyz");
		System.out.println(sb);
		sb.insert(4, true);
		System.out.println(sb);
	}
}
