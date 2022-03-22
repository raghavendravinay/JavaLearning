package strings2;

public class CharAtExampleForStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("durga");
		System.out.println(sb.charAt(3));// g
		try {
			System.out.println(sb.charAt(30));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
