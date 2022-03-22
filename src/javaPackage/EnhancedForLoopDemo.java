package javaPackage;

import java.util.Random;

public class EnhancedForLoopDemo {

	public static void main(String []args) {
		int[] nums=new int[10];
		Random r=new Random();
		for(int i=0; i<10;i++) {
			nums[i]=r.nextInt(100);
		}
		for (int n:nums) {
			System.out.print(n+" ");
		}
		System.out.println("");
	}
}
