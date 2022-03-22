package javaPackage;

public class LeftAndRightShiftDemo {

	public static void main(String []args) {
		int a=8; // binary format is 1000.oo
		int b=a<<2; //Left shift Operator. - Adds two zero on right side
		System.out.println(b);//output should be 10000 - 32
		
		a=25; // 11001
		 b=a>>2; // right shift Operator. - removes last two digits from the number 11001 -> 110
		System.out.println(b); // o/p 6
		
		a=25; // 11001 - 25
		b=a<<3;// 11001000 : 200
		System.out.println(b);
		b=a>>3;// 11 :3
		System.out.println(b);
		
	}
}
