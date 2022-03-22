package javaPackage;

public class PatternsDemo {
public static void main(String[] args) {
	for (int i=1; i<=6; i++) {
		for(int j=1; j<=i; j++) {
			int k=(i+j)%2;
			if(k==0)
			System.out.print("0 ");
			else
				System.out.print("1 ");
		}
		System.out.println("");
	}
}
}