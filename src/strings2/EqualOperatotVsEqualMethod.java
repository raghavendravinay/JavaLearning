package strings2;

public class EqualOperatotVsEqualMethod {

	public static void main(String args[]) {
		String s1 = new String("durga");
		String s2 = new String("durga");
		System.out.println(s1 == s2);// false... == - compares ref variable
		System.out.println(s1.equals(s2));// true... equals() - compares content
		/*
		 * equals() method in object class compares reference variable equals() method
		 * in String class overrides the method and compares content equals() method in
		 * StringBuffer and StringBuilder not overrides the object equal method and
		 * compares reference variable
		 */
		StringBuffer sb1 = new StringBuffer("software");
		StringBuffer sb2 = new StringBuffer("software");
		System.out.println(sb1 == sb2);// false... == - compares ref variable
		System.out.println(sb1.equals(sb2));// false... equals() - compares ref variable

		StringBuilder sbr1 = new StringBuilder("software");
		StringBuilder sbr2 = new StringBuilder("software");
		System.out.println(sbr1 == sbr2);// false... == - compares ref variable
		System.out.println(sbr1.equals(sbr2));// false... equals() - compares ref variable
	}
}
