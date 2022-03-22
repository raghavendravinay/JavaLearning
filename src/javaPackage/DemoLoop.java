package javaPackage;

public class DemoLoop {

	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
		
		// While Loop:
		int i=1;
		while(i<=10) {
			
		System.out.println(i);
		i++;		//i++ post increment   ++i pre increment
		}
		
		//do-while loop:
		int j=1;
		do
		{
			System.out.println(j);
			j++;
		}while(j<=10);
		
		//For loop
		for (int k=1; k<=10; k++) {
			System.out.println(k);
		}
		
//		while(true) {
//			System.out.println(i);
//		}
	}
}
