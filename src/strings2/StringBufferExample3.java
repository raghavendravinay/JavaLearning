package strings2;

public class StringBufferExample3 {

	public static void main(String args[]) {
		String s = new String("Vinay");// capacity is 16+length of the object
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());// 21

	}
}
