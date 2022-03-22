package strings2;

public class CharAtExample {

	public static void main(String[] args) {
		String s = "Java";
		System.out.println(s.charAt(1));
		try {
			System.out.println(s.charAt(10));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
