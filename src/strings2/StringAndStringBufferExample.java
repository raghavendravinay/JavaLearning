package strings2;

public class StringAndStringBufferExample {

	public static void main(String[] args) {
		String s = new String("Vinay");
		s.concat(" softaware");
		System.out.println(s);
		s = s.concat(" software");
		System.out.println(s);

		StringBuffer sb = new StringBuffer("Vinay");
		sb.append(" softwares");
		System.out.println(sb);

		StringBuilder sbr = new StringBuilder("Vinay");
		sbr.append(" solutions of India");
		System.out.println(sbr);

		String s1 = new String(sb);
		System.out.println(s1);

		String s2 = new String(sbr);
		System.out.println(s2);
	}
}
