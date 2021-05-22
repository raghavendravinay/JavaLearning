package strings;
import java.util.Scanner;

/**
 * This program is to print, whether the given key value is present in the given sentence
 * @author RaghavendraVinayM
 *
 */
public class FindAKeyWordFromGivenArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] s = new String[5];
		System.out.println("Enter a 5 word sentence");
		for(int i = 0; i < s.length; i++) 
		{
			s[i] = sc.next();
		}
		System.out.println("Enter a key word to find from the given senetence");
		String key = sc.next();
		for(int i = 0; i < s.length; i++) 
		{
			if(key.equals(s[i])) 
			{
				System.out.println("The given key word was found in the given sentence");
			}
		}
	}
}
