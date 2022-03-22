package javaPackage;

/*
 * 1
 * 0 1 
 * 1 0 1
 * 0 1 0 1
 */
public class PatternsDemo3 {

	public static void main(String []args) {
		for (int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				if((i+j)%2==0)
				System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println("");
		}
	}
}
