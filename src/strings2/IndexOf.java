package strings2;

public class IndexOf {
	public static void main(String[] args) {
		String s = "abcdefgh";
		// indexOf(char c) -it returns index of specified character
		System.out.println(s.indexOf('h'));// 7
		System.out.println(s.indexOf('c'));// 2
		System.out.println(s.indexOf('z'));// -1 - if specified character is not present then returns -1
		String s2 = "abbabbaba";
		System.out.println(s2.indexOf('a'));// 0 If the character available multiple times, then it will returns first
											// occurance
		System.out.println(s2.indexOf('b'));// 1

		// lastIndexOf(char ch)//-returns the last occurrence of the specified character
		System.out.println(s2.lastIndexOf('a'));
		System.out.println(s2.toUpperCase());
		String s3 = "ABCDEFGH";
		System.out.println(s3.toLowerCase());

		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
	}

}
