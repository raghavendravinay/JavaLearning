package strings;
/**
 * This program is to find the given two String or StringBuffer or StringBuilder values are 
 * equal or not by using "==" and equals() method
 * @author RaghavendraVinayM
 *
 */
public class EqualMethodExample_UsingMethods {

	public static void main(String[] args) {
		String s1 = new String("Vinay");
		String s2 = new String("Vinay");
		equalsMethod1(s1, s2);
		equalsMethod2(s1, s2);
		String s3 = "Vinay";
		String s4 = "Vinay";
		equalsMethod1(s3, s4);
		equalsMethod2(s3, s4);
		
		StringBuffer sb1 = new StringBuffer("Vinay");
		StringBuffer sb2 = new StringBuffer("Vinay");
		equalsMethod1(sb1, sb2);
		equalsMethod2(sb1, sb2);
		equalsMethod3(sb1, sb2);
		
		StringBuilder sbr1 = new StringBuilder("Vinay");
		StringBuilder sbr2 = new StringBuilder("Vinay");
		equalsMethod1(sbr1, sbr2);
		equalsMethod2(sbr1, sbr2);
		equalsMethod3(sbr1, sbr2);
	}
	public static void equalsMethod1(String s1, String s2) {
		boolean equal= s1.equals(s2);
		System.out.println(equal);
	}
	public static void equalsMethod2(String s1, String s2) {
		boolean equal = (s1 == s2);
		System.out.println(equal);
	}
	public static void equalsMethod1(StringBuffer sb1, StringBuffer sb2) {
		boolean equal= sb1.equals(sb2);
		System.out.println(equal);
	}
	public static void equalsMethod2(StringBuffer sb1, StringBuffer sb2) {
		boolean equal= sb1.toString() == sb2.toString();
		System.out.println(equal);
	}
	public static void equalsMethod3(StringBuffer sb1, StringBuffer sb2) {
		boolean equal= sb1.toString().equals(sb2.toString());
		System.out.println(equal);
	}
	public static void equalsMethod1(StringBuilder sbr1, StringBuilder sbr2) {
		boolean equal= sbr1.equals(sbr2);
		System.out.println(equal);
	}
	public static void equalsMethod2(StringBuilder sbr1, StringBuilder sbr2) {
		boolean equal= sbr1.toString() == sbr2.toString();
		System.out.println(equal);
	}
	public static void equalsMethod3(StringBuilder sbr1, StringBuilder sbr2) {
		boolean equal= sbr1.toString().equals(sbr2.toString());
		System.out.println(equal);
	}
}
