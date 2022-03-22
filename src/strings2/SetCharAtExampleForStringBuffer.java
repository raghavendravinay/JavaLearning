package strings2;

public class SetCharAtExampleForStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		sb.setCharAt(0, 'M');
		System.out.println(sb);// Mava
	}
}
