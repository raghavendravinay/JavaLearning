package javaPackage;

public class SwapDemo {

	public static void main(String [] args) {
		int a=5;
		int b=4;
		
		/*a=b;
		 * Swapping not done
		 * b=a;*/
		
		/*
		 * //method1: int temp; temp=a; // temp=5 a=b; // a=4 b=temp; // b=5 .......
		 * values changed but by using of extra variable wasting memory
		 */
		 
		/*
		 * // method2: a=a+b; // a=9 -> 1001 b=a-b; // b=5 -> 101 a=a-b; // a=4 -> 100
		 * //...swapping done //here 3 bit value changes to 4 bit value so it is also
		 * not effective
		 */		
		
		// Method3: ^ means xor.... 0 0 -> 0, 0 1 -> 1, 1 0 -> 1, 1 1 -> 0
		a=a^b; // 1 0 1 xor 1 0 0 -> 0 0 1 
		b=a^b; // 0 0 1 xor 1 0 0 -> 1 0 1
		a=a^b; // 0 0 1 xor 1 0 1 -> 1 0 0
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		// I have swapped two numbers without wasting even one bit
	}
}
