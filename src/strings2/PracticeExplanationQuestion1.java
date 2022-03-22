package strings2;

public class PracticeExplanationQuestion1 {

	public static void main(String[] args) {
		String ta = "A";
		ta = ta.concat("B");// ta=AB
		String tb = "C";
		ta = ta.concat(tb);// ABC
		ta.replace("C", "D");
		// ABC - but not pointed to any reference variable so available to
		// Garbage Collector
		ta = ta.concat(tb);// ABCC
		System.out.println(ta);// O/P is ABCC

	}
}
