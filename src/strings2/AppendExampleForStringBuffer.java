package strings2;

public class AppendExampleForStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("PI value is ");
		sb.append(3.14);
		sb.append(" It is exactly ");
		sb.append(true);
		System.out.println(sb);// PI value is 3.14 It is exactly true
		// append method argument can take any type of arguments like int, String,
		// boolean, byte... etc
	}
}
