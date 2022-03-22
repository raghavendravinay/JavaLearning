package strings2;

public class SubStringMethodExample {

	public static void main(String[] args) {
		String s = "RaghavendraVinayManikireddy";
		// First method substring(int begin)
		// substring(int begin) -- new String from begin index value to the end of the
		// String
		System.out.println(s.substring(0));// RaghavendraVinayManikireddy
		System.out.println(s.substring(11));// VinayManikireddy
		System.out.println(s.substring(16));// Manikireddy

		// First method substring(int begin, int end)
		// substring(int begin, int end) -- new String from begin index value to the
		// specified end index value of the String
		System.out.println(s.substring(5, 16));// vendraVinay
		System.out.println(s.substring(11, 16));// Vinay
		System.out.println(s.substring(16, 21));// Manik
	}
}
