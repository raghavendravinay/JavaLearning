package strings2;

public class EqualsIgnoreCaseExample {

	public static void main(String[] args) {
		String s = "Durga";
		System.out.println(s.equalsIgnoreCase("durga"));
		String s2 = "durga";
		System.out.println(s.equalsIgnoreCase(s2));
	}
}
