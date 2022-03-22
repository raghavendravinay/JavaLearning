package javaPackage;

public class PatternsDemosquare {

	public static void main(String[] args) {
		
//		for(int i=1; i<=4; i++) {
//			System.out.print("* ");
//		}
//		System.out.println("");
//		for(int i=1; i<=4; i++) {
//			System.out.print("* ");
//		}
//		System.out.println("");
//		for(int i=1; i<=4; i++) {
//			System.out.print("* ");
//		}
//		System.out.println("");
//		for(int i=1; i<=4; i++) {
//			System.out.print("* ");
//		}
//		System.out.println("");
		
		//Instead of the above code we use below code
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) { //Nesteed for loop square pattern
				System.out.print("* ");
		}
	System.out.println("");
		}
		
		System.out.println("");
		

		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) { //triangle pattern
				System.out.print("* ");
		}
	System.out.println("");
		}
		
		System.out.println("");
	
		for(int i=1; i<=4; i++) {
			for (int j=1; j<=4; j++) {
				int k=i+j-1;
				if(k>4)
					System.out.print(k-4+" ");
				else
				System.out.print(k+" ");
			}
			System.out.println("");
		}
	}
}
