package strings2;

public class StringExHeapAndScp {

	public static void main(String[] args) {
		String s1 = new String("Spring");
		s1.concat("fall");
		String s2 = s1.concat(" winter");
		s2.concat("summer");
		System.out.println(s1); // Spring
		System.out.println(s2); // Spring winter
	}
}
