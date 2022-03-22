package javaPackage;

public class JaggedArrayDemo 
{

	public static void main(String []args) 
	{
		int p[][]= {{5,6,7,8},{6,7,},{9,8,7}};
		for(int i[]:p) 
		{
		for (int j:i) 
		{
			System.out.print(j+" ");
		}
		System.out.println("");
		}
		int k[][]=new int[3][];
		k[0]=new int[4];
		k[1]=new int[2];
		k[2]=new int[3];
		
		for(int i[]:k) {
			for(int j:i) {
				System.out.print(j+" " );
			}
			System.out.println("");
		}
	}
}
