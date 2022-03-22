package strings2;

public class ConcatExample {

	public static void main(String[] args) {
		String s1 = "Durga";
		s1 = s1.concat(" software");
		System.out.println(s1);

		String s2 = "Durga";
		s2 = s2 + " Software";
		System.out.println(s2);

		String s3 = "Durga";
		s3 += " Software";
		System.out.println(s3);
	}
}
