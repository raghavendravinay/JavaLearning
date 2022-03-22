package strings2;

public class SetLengthMethodExampleForStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("RaghavendraVinay");
		sb.setLength(11);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
}
