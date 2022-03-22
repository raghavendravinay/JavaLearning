package javaPackage;

import java.util.Random;

public class Arrayoutofboundsexceptiondemo {

// this is for single dimensional array example
	public static void main(String []args) 
	{
		
		Random r=new Random();
		int a[]=new int[50];
		
		
		for (int i=0; i<a.length; i++)
		{
			a[i]=r.nextInt(50);
		}
		try {
		System.out.println(a[0]);
		}
catch(ArrayIndexOutOfBoundsException e) {		//catch(Exception e) {
			System.out.println("can't print a[52] because Maximum index is 49");
		}
		for (int i: a)
			System.out.println(i);
		
	}
}
