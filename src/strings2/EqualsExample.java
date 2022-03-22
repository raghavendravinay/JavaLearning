package strings2;

public class EqualsExample {

	public static void main(String[] args) {
		String s = "Vinay";
		System.out.println(s.equals("vinay")); // false
		// equals() method in String will always check for content comparision
		System.out.println(s.equals("Vinay"));// true
	}
}
