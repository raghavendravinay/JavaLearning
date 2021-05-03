package patterns;
import java.util.Scanner;
public class PyramidPattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");		//		ex:5
		int num=sc.nextInt();						//			0
		for(int i=1; i<=num; i++) {					//		   101
			for(int j=1; j<=num-i; j++) {			//		  21012
				System.out.print(" ");				//		 3210123
			}										//		432101234
			for(int k=(2*i)-1; k>0; k--) {
				System.out.print(Math.abs(k-i));
			}
			System.out.println("");
		}
	}
}
