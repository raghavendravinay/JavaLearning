package strings;
/**
 * This program is to find the given two String or StringBuffer or StringBuilder values are 
 * equal or not by using "==" and equals() method
 * @author RaghavendraVinayM
 *
 */
public class EqualMethodExample {

	public static void main(String[] args) {
		String s1 = new String("Vinay");
		String s2 = new String("Vinay");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		String s3 ="Vinay";
		String s4 = "Vinay";
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);
		
		
		StringBuffer sb1 = new StringBuffer("Vinay");
		StringBuffer sb2 = new StringBuffer("Vinay");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.toString() == sb2.toString());
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		StringBuilder sbr1 = new StringBuilder("Vinay");
		StringBuilder sbr2 = new StringBuilder("Vinay");
		System.out.println(sbr1.equals(sbr2));
		System.out.println(sbr1.toString() == sbr2.toString());
		System.out.println(sbr1.toString().equals(sbr2.toString()));
	}
}
