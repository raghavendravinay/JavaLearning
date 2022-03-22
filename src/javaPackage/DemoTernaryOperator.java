package javaPackage;

public class DemoTernaryOperator {
	public static void main(String[] args) {
		int i=1;	//i =1 once and i = 4 for 2nd time
		int j;
		if(i==1)
			j=6;
		else
			j=7;
		System.out.println(j);
		
		j=i==1?6:7;
		System.out.println(j);
	}

}
