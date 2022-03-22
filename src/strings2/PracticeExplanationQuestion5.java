package strings2;

public class PracticeExplanationQuestion5 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("java");
		// Line-1
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("equal");
		} else {
			System.out.println("Not Equal");
		}

		/*
		 * A) String s3=s2; - no if(s1==s3) B) if(s1.equalsIgnoreCase(s2)) - Yes C)
		 * String s3==s2; - no if(s1.equals(s3)) D)
		 * if(s1.toLowerCase()==s2.toLowerCase()) - NO
		 */
	}
}
