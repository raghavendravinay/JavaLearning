package javaPackage;


public class VarArgsDemo {

	public static void main(String []args) {
		Display obj= new Display();
//		obj.show(5);
//		obj.show(5,6);
//		obj.show(5,6,7);
		obj.show(5,546, 45, 50);
		obj.show(5); 
		/*
		 * if we pass a value, initially it will search for a method with exact
		 * Signature if it is not ther then it will search for the varargs
		 */
	}
}

class Display{
//	public void show(int a) {
//		System.out.println(a);
//	}
//	public void show(int a, int b) {
//		System.out.println(a);
//		System.out.println(b);
//	}
//	public void show(int a, int b,int c) {
//		System.out.print(a);
//		System.out.print(b);
//		System.out.print(c);
//	} 
	////Instead of all these we can add Varargs
	public void show(int ... a) //Varargs .........accepts only similar data type
	{
		for(int i:a) {
			System.out.print(i +" ");
		}
		System.out.println("");
	}
	public void show(int a) {			
		System.out.println(a+" in show a");
	}
}