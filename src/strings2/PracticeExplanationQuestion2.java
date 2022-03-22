package strings2;

public class PracticeExplanationQuestion2 {

	public static void main(String[] args) {
		String s = " ";
		s.trim();// not assigned to any variable so available for GC
		System.out.println(s.equals("") + " " + s.isEmpty());// false false

	}
}
