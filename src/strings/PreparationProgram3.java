package strings;
/**
 * This program is designed to print the string values only one time occur
 * @author RaghavendraVinayM
 *
 */
public class PreparationProgram3 {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c", "d"};
		String[] s2 = { "x", "y", "d"};
		int size = s1.length + s2.length;
		String[] s3 = new String[size];
		String[] s4 = new String[size];
		int[] num = new int[size];
		int count, k = 0;

		for(int i = 0; i < s1.length; i++) {
			s3[i] = s1[i];
			s4[i] = s3[i];
		}

		for(int i = s1.length, j = 0; i < s3.length; i++, j++) {
			s3[i] = s2[j];
			s4[i] = s3[i];
		}
		System.out.println("All string values");
		for(int i = 0; i < size; i++) {
			System.out.print(s3[i] + " ");
		}
		System.out.println();
	
		for(int i = 0; i < size; i++) {
			count = 1;
			if(!s4[i].equals("-1")) {
				for(int j = i + 1; j < size; j++) {
					if(s4[i] == s4[j]) {
						++count;
						s4[j] = "-1";
					}
				}
				num[k++] = count;
			}
		}
		k=0;
		System.out.println("one time occur string values");
		for(int i = 0; i < size; i++) {
			if(!s4[i].equals("-1") && (num[k++] == 1)) {
				System.out.print(s4[i] + " ");
			}
		}


	}
}
