package javaPackage;

public class DemoLabeledBreak {

	public static void main(String []args) {
	Vinay:
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i==3)
					break Vinay; //Unlabeled Break statement
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
