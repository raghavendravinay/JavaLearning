package javaPackage;

public class BitwiseANDOROperator {
	public static void main(String []args) {
		int a=25;		//Binary format of 25 is: 1	1	0	0	1
		int b=15;		//Binary format of 15 is: 0 1 	1	1	1 
		int c=a&b;		//output				: 0 1	0	0	1 - 9
		System.out.println(c); // output should be 9
		 a=25;		//Binary format of 25 is: 1	1	0	0	1
		 b=15;		//Binary format of 15 is: 0 1 	1	1	1 
		 c=a|b;		//output				: 1	1	1	1	1	- 1(16) 1(8)	1(4)	1(2)	1(1) - 31
		 System.out.println(c); // output should be 31
	}
}
